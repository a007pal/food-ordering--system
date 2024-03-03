package com.food.ordering.system.payment.service.dataaccess.payment.execption;

import com.food.ordering.system.payment.service.domain.entity.Payment;

public class PaymentDataaccessException extends RuntimeException {
    public PaymentDataaccessException(String message) {
        super(message);
    }
}
