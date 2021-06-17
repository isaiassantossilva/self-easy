package com.codedevs.core.userstories;

import com.codedevs.core.domain.User;
import com.codedevs.core.ports.driven.SmtpSendEmailPort;
import com.codedevs.core.ports.driver.SendEmailOfActivationPort;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Set;

@Named
public class SendEmailOfActivationUS implements SendEmailOfActivationPort {

    private final SmtpSendEmailPort emailPort;

    @Inject
    public SendEmailOfActivationUS(SmtpSendEmailPort emailPort) {
        this.emailPort = emailPort;
    }

    @Override
    public void execute(User user) {
        var message = new SmtpSendEmailPort.Message();
        message.setReceivers(Set.of("naneraruom@gmail.com", user.getEmail()));
        message.setBody("Link: localhost:8080/clients/check-by?token=" + user.getToken().getValue());
        message.setSubject("Lp2 <noresponse@gmail.com>");

        emailPort.execute(message);
    }
}
