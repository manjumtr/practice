package com.bookwise.security.infrastructure.command.data;

import java.lang.reflect.Method;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandHandlerHolder {
    private Method method;
    private Object commandHandler;

}
