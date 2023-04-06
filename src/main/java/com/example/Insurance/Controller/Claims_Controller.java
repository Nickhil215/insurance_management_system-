package com.example.Insurance.Controller;

import com.example.Insurance.DTO.ClaimDTO;
import com.example.Insurance.DTO.ClaimUpadateDTO;
import com.example.Insurance.Models.Claims;
import com.example.Insurance.Service.Claims_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("claim")
public class Claims_Controller {
    @Autowired
    Claims_Service claimsService;
    @PostMapping("create")
    public ResponseEntity<String> createClaim(@RequestBody()ClaimDTO claimDTO){
        claimsService.create(claimDTO);
        return new ResponseEntity<>("Successfully created", HttpStatus.ACCEPTED);
    }

    @PutMapping("update")
    public  ResponseEntity<String> updateClaim(@RequestBody()ClaimUpadateDTO claimUpadateDTO){
       String res= claimsService.update(claimUpadateDTO);
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("getinfo")
    public ResponseEntity<ClaimDTO> getClaim(@RequestParam("Id") int id){
        ClaimDTO claims=claimsService.getClaim(id);
        return new ResponseEntity<>(claims,HttpStatus.OK);
    }

    @DeleteMapping("delect")
    public ResponseEntity<String> deleteClaim(@RequestParam("Id") int id ){
       String res= claimsService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<ClaimDTO>> getAllClaims(){
        List<ClaimDTO> claimsList=claimsService.getAll();
        return new ResponseEntity<>(claimsList,HttpStatus.OK);
    }



}
