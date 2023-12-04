package com.lesson.bank.templates;

import java.math.BigDecimal;

public abstract class Client {

    private String name;

    private String surname;

    private String middlename;

    private short age;

    private BigDecimal balance = new BigDecimal(0);

    private String phoneNumber;

    private String email;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getBalance() {
        return String.valueOf(balance);
    }

    public void setBalance(String balance) {
        this.balance = BigDecimal.valueOf(Long.parseLong(balance));
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
