package com.example.Insurance.Controller;

import com.example.Insurance.DTO.PolicieDTO;
import com.example.Insurance.DTO.PolicyUpdateDTO;
import com.example.Insurance.Service.policies_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policie")
public class Policie_Controller {

    @Autowired
    policies_service policiesService;

    @PostMapping("create")
    public ResponseEntity<String> createPolice(@RequestBody() PolicieDTO policieDTO){
        policiesService.create(policieDTO);
        return  new ResponseEntity<>("Successfully Created", HttpStatus.ACCEPTED);
    }
    @PutMapping("Upadate")
        public ResponseEntity<String> updatePolicie(@RequestBody() PolicyUpdateDTO policies){
        String res=policiesService.update(policies);
        return  new ResponseEntity<>(res,HttpStatus.ACCEPTED);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deletePolice(@RequestParam("Id") int id){
       String res= policiesService.deletePolicie(id);
        return  new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("get")
    public  ResponseEntity<PolicieDTO> getPolicie(@RequestParam("Id") int id){
        PolicieDTO policie=policiesService.getInfo(id);
        return  new ResponseEntity<>(policie,HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<PolicieDTO>> getAllPolicies(){
        List<PolicieDTO> policiesList=policiesService.getAllPolicies();
        return new ResponseEntity<>(policiesList,HttpStatus.OK);
    }



}
