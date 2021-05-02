package com.example.demo.clients;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {


    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public List<client> getClients() {

        return clientRepository.findAll();
    }

    public void addNewClient(client client) {

       /*  Optional<client> findByAdd= clientRepository.findByAdd(client.getAddress());

        if(findByAdd.isPresent()){
            throw new IllegalStateException("address Exists");
        }
        clientRepository.save(client);
        */
        System.out.println(client);
    }
}
