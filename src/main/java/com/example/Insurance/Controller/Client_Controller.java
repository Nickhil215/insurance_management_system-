package com.example.Insurance.Controller;

import com.example.Insurance.DTO.clientDTO;
import com.example.Insurance.DTO.clientUpdateDTO;
import com.example.Insurance.Models.Client;
import com.example.Insurance.Service.Client_Service;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class Client_Controller {
    @Autowired
    Client_Service clientService;


    @PostMapping("create")
    public ResponseEntity<String> createClient(@RequestBody() clientDTO clientDTO){
        clientService.create(clientDTO);
        return new ResponseEntity<>("Successfully Created" , HttpStatus.CREATED);
    }
    @PutMapping("Update")
    public  ResponseEntity<String> updateClientInfo (@RequestBody() clientUpdateDTO client){
       String res= clientService.upadateInfo(client);
        return  new ResponseEntity<>(res,HttpStatus.OK);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteClient(@RequestParam("Id") int id){
       String res= clientService.deleteClient(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("get")
    public ResponseEntity<clientDTO> getClientInfo(@RequestParam("Id") int id){
        clientDTO client=clientService.getClient(id);
        return new ResponseEntity<>(client,HttpStatus.FOUND);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<clientDTO>> getAllClients(){
        List<clientDTO> list=clientService.getAllClients();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
