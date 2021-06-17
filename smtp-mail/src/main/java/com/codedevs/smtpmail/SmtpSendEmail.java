package com.codedevs.smtpmail;

import com.codedevs.core.ports.driven.SmtpSendEmailPort;
import org.springframework.mail.javamail.JavaMailSender;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SmtpSendEmail implements SmtpSendEmailPort {

    private final JavaMailSender mailSender;

    @Inject
    public SmtpSendEmail(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void execute(Message message) {
        System.out.println("ENVIANDO EMAIL");
//        var mime = mailSender.createMimeMessage();
//        var helper = new MimeMessageHelper(mime, "UTF-8");
//
//        try {
//            helper.setFrom("LP II <noresponse@lp2.ifce.edu.br>");
//            helper.setTo(message.getReceivers().toArray(new String[0]));
//            helper.setSubject(message.getSubject());
//            helper.setText("<b>" + message.getBody() + "</b>", true);
//
//            mailSender.send(mime);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
    }
}
