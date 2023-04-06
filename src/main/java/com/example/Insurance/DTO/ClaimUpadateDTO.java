package com.example.Insurance.DTO;

import com.example.Insurance.Enums.ClaimStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Data
public class ClaimUpadateDTO {
    private  int id;
    @CreationTimestamp
    private Date claimDate;
    @Enumerated(value = EnumType.STRING)
    private ClaimStatus cliamStatus;
    private  int policieId;
    private String description;
}
