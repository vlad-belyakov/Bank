package com.lesson.bank.server;

import com.lesson.bank.templates.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ServerClient implements Client {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "middlename")
    private String middlename;

    @Column(name = "age")
    private short age;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "balance")
    private BigDecimal balance = new BigDecimal(0);

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "registration_date")
    private String registrationDate;

    public void setRegistrationDate(){
        registrationDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    }

    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getMiddlename() {
        return middlename;
    }

    @Override
    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Override
    public short getAge() {
        return age;
    }

    @Override
    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public void setCardNumber(Long id){
        cardNumber = String.format("230024%d", 1000000000 + id);
    }

    @Override
    public String getCardNumber(){
        return cardNumber;
    }

    @Override
    public String getBalance() {
        return String.valueOf(balance);
    }

    @Override
    public void setBalance(String balance) {
        this.balance = BigDecimal.valueOf(Long.parseLong(balance));
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    @Autowired
    @Qualifier("")
    public void setId(Long id) {
        this.id = id;
    }

}
