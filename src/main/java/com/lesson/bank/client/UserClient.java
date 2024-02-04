package com.lesson.bank.client;

import com.lesson.bank.RegistrationScreenController;
import com.lesson.bank.templates.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import javax.persistence.*;

@Component
@Entity
@Table(name = "clients")
public class UserClient implements Client{

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_surname")
    private String surname;

    @Column(name = "client_middlename")
    private String middlename;

    @Column(name = "client_age")
    private short age;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "client_balance")
    private BigDecimal balance = new BigDecimal(0);

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "client_email")
    private String email;

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
    public void setCardNumber(Long id) {

    }

    @Override
    public String getCardNumber() {
        return null;
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
    public void setId(Long id) {
        this.id = id;
    }

}
