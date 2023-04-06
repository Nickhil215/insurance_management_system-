package com.example.Insurance.DTO;

import com.example.Insurance.Enums.PolicyType;
import com.example.Insurance.Enums.Premium;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
public class PolicyUpdateDTO {
    private int id;
    @Enumerated(value = EnumType.STRING)
    private PolicyType policyType;

    private String amount;
    @Enumerated(value = EnumType.STRING)
    private Premium premium;
    private LocalDate End;
}
