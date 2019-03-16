package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "")
public class UserApp {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        int id;
        String login;
        String password;
        String name;
        String initials;
        Boolean isSeller;
        Boolean isAdmin;
        Boolean isService;
    @OneToOne(fetch = FetchType.EAGER)
    Rma rma;
}
