package com.codedevs.core.ports.driver;

import com.codedevs.core.domain.User;

public interface SendEmailOfActivationPort {

    void execute(User user);

}
