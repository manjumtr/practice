package com.bookwise.security.infrastructure.command.service;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookwise.security.infrastructure.command.data.Command;
import com.bookwise.security.infrastructure.command.data.CommandResult;
import com.bookwise.security.infrastructure.command.domain.CommandAudit;

@Service
public class CommandGatewaySeviceImpl implements CommandGatewayService {
    private final CommandExecutionService commandService;

    @Autowired
    public CommandGatewaySeviceImpl(final CommandExecutionService commandService) {
        this.commandService = commandService;

    }

    @Override
    public <R> CommandResult<R> process(Command<?> command, Class<R> response) throws Throwable {
        CommandAudit commandAudit = command.buildCommandAudit();
        try {
            return this.commandService.process(commandAudit, command, response);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw e.getCause();
        }
    }

}
