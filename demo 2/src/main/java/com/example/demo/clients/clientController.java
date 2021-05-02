package com.example.demo.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/clients")
public class clientController {

    private final ClientService clientService;

    @Autowired
    public clientController(ClientService clientService){
        this.clientService=clientService;
    }

    @GetMapping
        public List<client> getClients() {
           return clientService.getClients();
        }

        @PostMapping
        public void registerNewClient(@RequestBody client client){
            clientService.addNewClient(client);
        }
    }

