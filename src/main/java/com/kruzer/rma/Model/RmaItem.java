package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class RmaItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        int id;
        String type;
        String manufacture;
        String model;
        String serialNumber;
    @ManyToOne()
    @JoinColumn(name = "rma_id")
    Rma rma;
}
