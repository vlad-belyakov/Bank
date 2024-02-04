package com.lesson.bank.controllers;

import com.lesson.bank.services.ClientService;
import com.lesson.bank.templates.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public String getInfo(@RequestParam("client_name") String client_name){
        return client_name;
    }

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllOwners(){
        return clientService.readAllClients();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Client getClientById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @GetMapping("/{phoneNumber}")
    @ResponseStatus(HttpStatus.FOUND)
    public Client getClientByPhoneNumber(@PathVariable String phoneNumber){
        return clientService.findByPhoneNumber(phoneNumber);
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client updateClient(@PathVariable Long id, @RequestBody Client client){
        return clientService.updateClient(client, id);
    }

}
