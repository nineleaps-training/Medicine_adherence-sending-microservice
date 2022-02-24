package com.example.sendeservice;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Mailreceiver {

    @Autowired
    private JavaMailSender javaMailSender;

    @RabbitListener(queues = "mail")
    public void receive(MailInfo mailInfo) {

     System.out.println("received");
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(mailInfo.getReceiver_mail());
            message.setSubject("Caretaker request");
            message.setText("Please join through thiss link");
            javaMailSender.send(message);



    }


}
