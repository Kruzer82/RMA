package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Rma {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        int id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "rma")
        List<RmaItem> rmaItems;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
        Client client;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    Users users;
        LocalDateTime registerDate;
        LocalDateTime updateDate;
        String Status;
        int Invoice;
        int SO;
        String trackingNumber;
        Boolean isDelete;

}
