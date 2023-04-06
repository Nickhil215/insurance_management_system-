package com.example.Insurance.Models;

import javax.persistence.*;

import com.example.Insurance.Enums.ClaimStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Claims {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String description;

    @CreationTimestamp
    private Date claimDate;
    @Enumerated(value = EnumType.STRING)
    private ClaimStatus cliamStatus;

    @OneToOne
    @JoinColumn
    private Policies policie;

}
