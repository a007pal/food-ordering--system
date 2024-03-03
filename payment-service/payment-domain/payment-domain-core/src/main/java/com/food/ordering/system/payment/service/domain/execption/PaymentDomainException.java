package com.food.ordering.system.payment.service.domain.execption;

import com.food.ordering.system.domain.exception.DomainException;

public class PaymentDomainException extends DomainException {
    public PaymentDomainException(String message) {
        super(message);
    }
}
