package com.sixdu.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("qq")
public class EmailApplicationTests {
    @Autowired private JavaMailSender mailSender;

    @Value("${spring.mail.username}") private String username;

    @Test
    public void contextLoads() {
        System.out.println("-----------email sender start -------------");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(username);
        message.setTo("1010092742@qq.com");
        message.setSubject("主题：Test");
        message.setText("老妈人");
        try {
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------email sender success -------------");
    }

}
