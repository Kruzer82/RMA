package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    int id;
    String login;
    String password;
    String name;
    String initials;
    Boolean isSeller;
    Boolean isAdmin;
    Boolean isService;
}
