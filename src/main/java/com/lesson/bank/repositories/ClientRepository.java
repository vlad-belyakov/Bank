package com.lesson.bank.repositories;

import com.lesson.bank.templates.Client;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

    public Client findByEmail(String email);
    public Client findByPhoneNumber(String phoneNumber);
    public Client findByCardNumber(String cardNumber);
    public Client read(Long id);
    public Optional<Client> findById(Long id);
    public boolean existsById(Long id);
    public boolean existsByPhoneNumber(String phoneNumber);
    public List<Client> getAllClients();
    public List<Client> getAllClientsByPhoneNumber();
    public List<Client> getAllClientsByEmail();
    public void deleteById(Long id);
    public boolean existsBy(Long id);
}
