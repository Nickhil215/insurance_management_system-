package com.example.Insurance.Service;

import com.example.Insurance.DTO.ClaimDTO;
import com.example.Insurance.DTO.ClaimUpadateDTO;
import com.example.Insurance.Models.Claims;
import com.example.Insurance.Models.Policies;
import com.example.Insurance.Repository.Claims_Repo;
import com.example.Insurance.Repository.Policies_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Claims_Service {

    @Autowired
    Claims_Repo claimsRepo;
    @Autowired
    Policies_Repo policiesRepo;
    public void create(ClaimDTO claimDTO) {
        Claims claims=new Claims();
        claims.setClaimDate(claimDTO.getClaimDate());
        claims.setCliamStatus(claimDTO.getCliamStatus());
       claims.setDescription(claimDTO.getDescription());
        Policies policies=policiesRepo.findById(claimDTO.getPolicieId()).get();
        policies.setClaims(claims);
        claims.setPolicie(policies);
        claimsRepo.save(claims);
    }

    public String update(ClaimUpadateDTO claims) {
        if(claimsRepo.existsById(claims.getId())){
            Claims claims1=claimsRepo.findById(claims.getId()).get();
            claims1.setDescription(claims1.getDescription());
            claims1.setCliamStatus(claims1.getCliamStatus());
            claims1.setClaimDate(claims.getClaimDate());
            claims1.setDescription(claims.getDescription());
            claimsRepo.save(claims1);
            return "Successfully updated";
        }else{
            return "No claims are present with given details";
        }


    }

    public ClaimDTO getClaim(int id) {
        ClaimDTO claimDTO=new ClaimDTO();
        if(claimsRepo.existsById(id)) {
            Claims claims=claimsRepo.findById(id).get();

            Policies policies=claims.getPolicie();
            claimDTO.setPolicieId(policies.getId());
            claimDTO.setDescription(claims.getDescription());
            claimDTO.setCliamStatus(claims.getCliamStatus());
            claimDTO.setClaimDate(claims.getClaimDate());

        }else{
//            claimDTO.setClaimDate();
        }
        return claimDTO;
    }

    public List<ClaimDTO> getAll() {

        List<Claims> claims=claimsRepo.findAll();
        List<ClaimDTO> claimDTOList=new ArrayList<>();
        for(Claims c:claims){
            ClaimDTO claimDTO=new ClaimDTO();
            claimDTO.setClaimDate(c.getClaimDate());
            claimDTO.setCliamStatus(c.getCliamStatus());
            claimDTO.setDescription(c.getDescription());
            Policies p=c.getPolicie();
            claimDTO.setPolicieId(p.getId());
            claimDTOList.add(claimDTO);

        }
        return claimDTOList;
    }

    public String delete(int id) {
        if(claimsRepo.existsById(id)){
            claimsRepo.deleteById(id);
            return "Successfully deleted";
        }else{
            return "No Claims are present with given ID";
        }


    }
}
