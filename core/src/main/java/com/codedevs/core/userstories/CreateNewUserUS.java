package com.codedevs.core.userstories;

import com.codedevs.core.domain.User;
import com.codedevs.core.ports.driven.CryptPasswordPort;
import com.codedevs.core.ports.driven.UserRepositoryPort;
import com.codedevs.core.ports.driver.CreateNewUserPort;
import com.codedevs.core.ports.driver.SendEmailOfActivationPort;
import com.codedevs.core.valueobject.Token;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CreateNewUserUS implements CreateNewUserPort {

    private final UserRepositoryPort userRepositoryPort;
    private final CryptPasswordPort cryptPasswordPort;
    private final SendEmailOfActivationPort sendEmailOfActivationPort;

    @Inject
    public CreateNewUserUS(UserRepositoryPort userRepositoryPort, CryptPasswordPort cryptPasswordPort, SendEmailOfActivationPort sendEmailOfActivationPort) {
        this.userRepositoryPort = userRepositoryPort;
        this.cryptPasswordPort = cryptPasswordPort;
        this.sendEmailOfActivationPort = sendEmailOfActivationPort;
    }

    @Override
    public User execute(User user) {
        var encodePassword = cryptPasswordPort.encodePassword(user.getPassword());
        user.setPassword(encodePassword);
        user.setToken(new Token());
        var userSaved = userRepositoryPort.save(user);
        sendEmailOfActivationPort.execute(user);
        return userSaved;
    }
}
