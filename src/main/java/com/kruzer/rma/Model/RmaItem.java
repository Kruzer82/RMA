package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class RmaItem {
    @Id
    @GeneratedValue
    int id;
    String type;
    String manufacture;
    String model;
    String serialNumber;
}
