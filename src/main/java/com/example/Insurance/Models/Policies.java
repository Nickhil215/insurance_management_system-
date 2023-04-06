package com.example.Insurance.Models;

import javax.persistence.*;

import com.example.Insurance.Enums.PolicyType;
import com.example.Insurance.Enums.Premium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String number= UUID.randomUUID().toString();;
    @Enumerated(value = EnumType.STRING)
    private PolicyType policyType;

    private String amount;
    @Enumerated(value = EnumType.STRING)
    private Premium premium;


    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date Start;

    private LocalDate End;

    @ManyToOne
    @JoinColumn
    private Client client;

    @OneToOne(mappedBy = "policie",cascade = CascadeType.ALL)
    private Claims claims;

}
