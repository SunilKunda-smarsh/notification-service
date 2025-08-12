package com.smarsh.notification_service_demo.model;

import lombok.Data;

@Data
public class Notification {
    private String recipient;
    private String message;
    private String subject;
}
