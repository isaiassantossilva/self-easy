package com.codedevs.core.domain;

import com.codedevs.core.enuns.DeliveryMethod;
import com.codedevs.core.enuns.SolicitationStatus;
import lombok.Getter;

@Getter
public class Cart {
    private String requestID;
    private SolicitationStatus status;
    private DeliveryMethod delivery;
}
