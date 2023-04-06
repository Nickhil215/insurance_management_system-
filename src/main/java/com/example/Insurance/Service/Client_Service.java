package com.example.Insurance.Service;

import com.example.Insurance.DTO.clientDTO;
import com.example.Insurance.DTO.clientUpdateDTO;
import com.example.Insurance.Models.Client;
import com.example.Insurance.Repository.Client_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Client_Service {

    @Autowired
    Client_Repo clientRepo;
    public void create(clientDTO clientDTO) {
      Client client=new Client();
      client.setName(clientDTO.getName());;
      client.setAddress(clientDTO.getAddress());
      client.setContat(clientDTO.getContact());
      client.setDOB(clientDTO.getDOB());
      client.setPoliciesList(new ArrayList<>());
      clientRepo.save(client);
    }

    public String upadateInfo(clientUpdateDTO client) {
        if(clientRepo.existsById(client.getId())){
            Client client1=clientRepo.findById(client.getId()).get();
            client1.setName(client.getName());
            client1.setDOB(client.getDOB());
            client1.setAddress(client.getAddress());
            client1.setContat(client.getContact());
            clientRepo.save(client1);
            return "Client Details updated Successfully";
        }else{
            return "Client Not present with given Details";
        }

    }

    public String deleteClient(int id) {
        if(clientRepo.existsById(id)){
        clientRepo.deleteById(id);
        return "Successfully client Deleted";
        }else {
            return "No Client Present with given Id";
        }
    }

    public clientDTO getClient(int id) {
        clientDTO clientDTO = new clientDTO();
        if(clientRepo.existsById(id)) {
            Client client = clientRepo.findById(id).get();
            clientDTO.setName(client.getName());
            clientDTO.setDOB(client.getDOB());
            clientDTO.setAddress(client.getAddress());
            clientDTO.setContact(client.getContat());

        }else {
            clientDTO.setAddress("NULL");
            clientDTO.setContact("NULL");
            clientDTO.setDOB("NULL");
            clientDTO.setName("NUll");
        }
        return clientDTO;
    }

    public List<clientDTO> getAllClients() {
        List<Client> clients=clientRepo.findAll();
        List<clientDTO> clientDTOS=new ArrayList<>();
        for(Client client: clients){
            clientDTO clientDTO=new clientDTO();
            clientDTO.setName(client.getName());
            clientDTO.setDOB(client.getDOB());
            clientDTO.setAddress(client.getAddress());
            clientDTO.setContact(client.getContat());
            clientDTOS.add(clientDTO);
        }
        return clientDTOS;
    }
}
