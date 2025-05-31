package com.example.cms.user.service;

import com.example.cms.user.client.MailgunClient;
import com.example.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendMail() {

        SendMailForm form = SendMailForm.builder()
                .from("mailgun@example.com")
                .to("shalisa@naver.com")
                .subject("Test email from zero base")
                .text("my text")
                .build();

        return mailgunClient.sendMail(form).getBody();
    }
}
