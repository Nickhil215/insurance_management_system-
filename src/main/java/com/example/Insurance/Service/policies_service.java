package com.example.Insurance.Service;

import com.example.Insurance.DTO.PolicieDTO;
import com.example.Insurance.DTO.PolicyUpdateDTO;
import com.example.Insurance.Enums.PolicyType;
import com.example.Insurance.Enums.Premium;
import com.example.Insurance.Models.Client;
import com.example.Insurance.Models.Policies;
import com.example.Insurance.Repository.Client_Repo;
import com.example.Insurance.Repository.Policies_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class policies_service {
    @Autowired
    Policies_Repo policiesRepo;
    @Autowired
    Client_Repo clientRepo;
    @Autowired
    Claims_Service claimsService;
    public void create(PolicieDTO policieDTO) {
    Policies policies=new Policies();
    policies.setAmount(policieDTO.getAmount());
    policies.setPolicyType(policieDTO.getPolicyType());
    policies.setPremium(policieDTO.getPremium());
    policies.setEnd(policieDTO.getEnd());
        Client client=clientRepo.findById(policieDTO.getClientId()).get();
        List<Policies> policiesList=client.getPoliciesList();
        policiesList.add(policies);
        policies.setClient(client);

    policiesRepo.save(policies);

    }

    public String update(PolicyUpdateDTO policies) {
       if(policiesRepo.existsById(policies.getId())){
           Policies policies1=policiesRepo.findById(policies.getId()).get();
           policies1.setPolicyType(policies.getPolicyType());
           policies1.setAmount(policies.getAmount());
           policies1.setEnd(policies.getEnd());
           policies1.setPremium(policies.getPremium());
           policiesRepo.save(policies1);
           return "Policies Successfully updated";
       }
       else {
          return "No policie is present with given details";
       }
    }

    public String deletePolicie(int id) {
        if(policiesRepo.existsById(id)){
            policiesRepo.deleteById(id);
            return "Successfully deleted";
        }
        else {
            return "Policie not present please check enter currect id";
        }

    }

    public PolicieDTO getInfo(int id) {

        PolicieDTO policieDTO=new PolicieDTO();
        if(policiesRepo.existsById(id)){
            Policies policies=policiesRepo.findById(id).get();
            policieDTO.setAmount(policies.getAmount());
            policieDTO.setEnd(policies.getEnd());
            policieDTO.setPremium(policies.getPremium());
            policieDTO.setPolicyType(policies.getPolicyType());
            Client client=policies.getClient();
            policieDTO.setClientId(client.getId());
        }else {
            policieDTO.setClientId(0);
            policieDTO.setAmount("0");
            policieDTO.setPolicyType(PolicyType.NULL);
            policieDTO.setPremium(Premium.NULL);
        }
        return policieDTO;

    }

    public List<PolicieDTO> getAllPolicies() {
        List<Policies> policiesList=policiesRepo.findAll();
        List<PolicieDTO> policieDTOS=new ArrayList<>();
        for(Policies policies : policiesList){
            PolicieDTO policieDTO=new PolicieDTO();
            policieDTO.setAmount(policies.getAmount());
            policieDTO.setEnd(policies.getEnd());
            policieDTO.setPremium(policies.getPremium());
            policieDTO.setPolicyType(policies.getPolicyType());
            Client client=policies.getClient();
            policieDTO.setClientId(client.getId());
            policieDTOS.add(policieDTO);
        }
        return policieDTOS;
    }
}
