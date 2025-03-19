package com.bookwise.security.infrastructure.command.service;

import com.bookwise.security.infrastructure.command.data.Command;
import com.bookwise.security.infrastructure.command.data.CommandResult;

public interface CommandGatewayService {

    <R> CommandResult<R> process(final Command<?> command, Class<R> response) throws Throwable;

}
