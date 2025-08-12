package com.smarsh.notification_service_demo.rest;

import com.smarsh.notification_service_demo.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/notifications")
@Slf4j
public class NotificationController {
    @PostMapping
    public String sendNotification(@RequestBody Notification notification) {
        // Logic to send notification
        log.info("Sending notification to: {}", notification.getRecipient());
        log.info("Message: {}", notification.getMessage());
        log.info("Subject: {}", notification.getSubject());
        return "Notification sent successfully!";
    }
}
