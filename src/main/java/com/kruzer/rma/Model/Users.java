package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        int id;
        String login;
        String password;
        @NotNull
        String name;
        String initials;
        Boolean isSeller;
        Boolean isAdmin;
        Boolean isService;
    @OneToOne(fetch = FetchType.EAGER)
        Rma rma;
}
