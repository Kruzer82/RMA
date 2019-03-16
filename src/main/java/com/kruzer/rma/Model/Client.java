package com.kruzer.rma.Model;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
//@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        int id;
        String name;
        String person;
        String phoneNumber;
        String eMail;
        @OneToOne(mappedBy = "client")
        Rma rma;
    @OneToOne(fetch = FetchType.EAGER)
    Rma rma_c;
    @OneToOne(fetch = FetchType.EAGER)
        UserApp userApp;
}
