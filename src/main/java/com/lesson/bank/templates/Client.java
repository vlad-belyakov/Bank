package com.lesson.bank.templates;


public interface Client {

    public String getName();

    void setName(String name);

    String getSurname();

    void setSurname(String surname);

    String getMiddlename();

    void setMiddlename(String middlename);

    public short getAge();

    public void setAge(short age);

    public void setCardNumber(Long id);

    public String getCardNumber();

    public String getBalance();

    public void setBalance(String balance);

    public String getPhoneNumber();

    public void setPhoneNumber(String phoneNumber);

    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public Long getId();

    public void setId(Long id);
}
