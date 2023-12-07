package com.lesson.bank.client;

import com.lesson.bank.templates.Client;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "clients")
public class UserClient implements Client {
    public UserClient(){}

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "middlename")
    private String middlename;

    @Column(name = "age")
    private short age;

    private BigDecimal balance = new BigDecimal(0);

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "email")
    private String email;


    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int id;

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
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
