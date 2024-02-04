package com.lesson.bank.services;

import com.lesson.bank.client.UserClient;
import com.lesson.bank.repositories.ClientRepository;
import com.lesson.bank.server.ServerClient;
import com.lesson.bank.templates.Client;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@Lazy
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client){
        clientRepository.save(client);
        return client;
    }
    public List<Client> readAllClients(){
        return clientRepository.getAllClients();
    }

    public Client readClient(Long id){
        if (clientRepository.existsBy(id)) {
            return clientRepository.read(id);
        } else {
            throw new RuntimeException("не удалось прочитать пользователя с таким айди");
        }
    }

    public Client findById(Long id){
        if (clientRepository.existsBy(id)) {
            return clientRepository.findById(id).get();
        } else {
            throw new RuntimeException("не удалось найти пользователя с таким айди");
        }
    }

    public Client updateClient(Client client, Long id){
        if (clientRepository.existsBy(id)) {
            clientRepository.save(client);
            return client;
        } else {
            throw new RuntimeException("нет пользователя с таким айди для обновления данных");
        }
    }

    public Client findByPhoneNumber(String phoneNumber){
        if (clientRepository.existsByPhoneNumber(phoneNumber)){
            return clientRepository.findByPhoneNumber(phoneNumber);
        } else {
            throw new RuntimeException("нет пользователя с таким номером телефона");
        }
    }

    public void deleteClient(Long id){
        if(clientRepository.existsBy(id)){
            clientRepository.deleteById(id);
        } else {
            throw new RuntimeException("удаление пользователя невозможно из-за его отсутствия");
        }
    }
}
