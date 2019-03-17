package com.kruzer.rma.Model;

import lombok.Data;
import org.aspectj.lang.annotation.DeclareAnnotation;

import javax.persistence.*;
import java.util.List;

@Data
@Entity

public class Manufacture {
    @Id
    @GeneratedValue
        int id;
        String manufacture;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "type")
    List<RmaItem> rmaItems;

}
