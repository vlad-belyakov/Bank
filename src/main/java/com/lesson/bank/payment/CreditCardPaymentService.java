package com.lesson.bank.payment;

import com.lesson.bank.templates.CreditCardPayment;
import com.lesson.bank.templates.PhoneNumberPayment;
import com.lesson.bank.templates.WebMoneyPayment;

public class CreditCardPaymentService implements CreditCardPayment, PhoneNumberPayment, WebMoneyPayment {

    @Override
    public void payCreditCard() {

    }

    @Override
    public void payPhoneNumber() {

    }

    @Override
    public void payWebMoney() {

    }
}
