package com.kruzer.rma.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity

public class Type {
    @Id
    @GeneratedValue
        int id;
        String type;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "type")
        List<RmaItem> rmaItems;
}
