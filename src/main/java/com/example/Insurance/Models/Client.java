package com.example.Insurance.Models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;

    private  String DOB;
    private  String address;
    private String contat;
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private List<Policies> policiesList;



}
