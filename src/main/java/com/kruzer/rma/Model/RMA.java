package com.kruzer.rma.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class RMA {
    @Id
    @GeneratedValue
    int id;
    List<RmaItem> rmaItems;
    int idClient;
    LocalDateTime registerDate;
    LocalDateTime updateDate;
    String Status;
    int Invoice;
    int SO;
    String trackingNumber;
    Boolean isDelete;

}
