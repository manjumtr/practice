package com.bookwise.security.infrastructure.command.data;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandResult<R> {
    private R result;

    public R getResult() {
        if (Objects.nonNull(result)) {
            return result;
        }
        return null;

    }

}
