package com.bookwise.security.infrastructure.command.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.bookwise.security.infrastructure.command.annotation.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import com.bookwise.security.infrastructure.command.annotation.ProcessCommand;
import com.bookwise.security.infrastructure.command.data.Command;
import com.bookwise.security.infrastructure.command.data.CommandHandlerHolder;
import com.bookwise.security.infrastructure.command.data.CommandResult;
import com.bookwise.security.infrastructure.command.domain.CommandAudit;
import com.bookwise.security.infrastructure.command.domain.CommandAuditRepositoryWrapper;

import jakarta.transaction.Transactional;

@Service
public class CommandExecutionService {

    private final ApplicationContext context;
    private final CommandAuditRepositoryWrapper commandAuditRepository;

    @Autowired
    public CommandExecutionService(final ApplicationContext context,
            final CommandAuditRepositoryWrapper commandAuditRepository) {
        this.context = context;
        this.commandAuditRepository = commandAuditRepository;
    }

    @Transactional
    public <R> CommandResult<R> process(final CommandAudit audit, final Command<?> command, Class<R> clazz)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CommandResult<R> result = new CommandResult<>();
        CommandHandlerHolder holder = findCommandHandler(command);
        Object resultObject = holder.getMethod().invoke(holder.getCommandHandler(), command);
        this.commandAuditRepository.save(audit);
        R response = clazz.cast(resultObject);
        result.setResult(response);
        return result;

    }

    private CommandHandlerHolder findCommandHandler(final Command<?> command) {
        Map<String, Object> commandHandlers = this.context.getBeansWithAnnotation(CommandHandler.class);
        for (Object commandHandler : commandHandlers.values()) {
            Method[] methods = commandHandler.getClass().getDeclaredMethods();
            for (Method method : methods) {
                ProcessCommand processCommand = AnnotationUtils.findAnnotation(method, ProcessCommand.class);
                if (processCommand != null && method.getParameterCount() > 0
                        && method.getParameters()[0].getParameterizedType().equals(command.getClass())) {
                    return CommandHandlerHolder.builder().method(method).commandHandler(commandHandler).build();
                }
            }
        }
        return null;
    }

}
