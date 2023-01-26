package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClinet(@RequestBody Client client) {
        return clientRepository.save(client);
    }

    @GetMapping("/")
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }
}
