package com.example.cms.user.client.service;

import com.example.cms.user.config.FeignConfig;
import com.example.cms.user.service.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private EmailSendService emailSendService;

    @Test
    public void sendMail() {
        String response = emailSendService.sendMail();
        System.out.println(response);
    }
}