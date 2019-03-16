package com.kruzer.rma.Model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    int id;
    String name;
    String person;
    String phoneNumber;
    String eMail;
    int idSeller;
}
