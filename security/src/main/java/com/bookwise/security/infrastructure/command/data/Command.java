package com.bookwise.security.infrastructure.command.data;

import com.bookwise.security.infrastructure.command.domain.CommandAudit;
import com.google.gson.Gson;

import lombok.Data;

@Data
public abstract class Command<P> {
    private String entity;
    private String action;
    private String method;
    private String url;

    public abstract P getPayload();

    public Command(final String entity, final String action, final String method, final String url) {
        this.action = action;
        this.entity = entity;
        this.url = url;
        this.method = method;
    }

    public CommandAudit buildCommandAudit() {
        Gson gson = new Gson();
        final String payloadJson = gson.toJson(getPayload());
        CommandAudit commandAudit = CommandAudit.builder().action(this.action).entity(this.entity).url(this.url)
                .method(this.method).payload(payloadJson)
                .build();
        return commandAudit;
    }
}
