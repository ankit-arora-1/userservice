package com.dev.userservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailMessageDto {
    private String to;
    private String from;
    private String body;
    private String subject;
}
