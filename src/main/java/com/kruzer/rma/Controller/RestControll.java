package com.kruzer.rma.Controller;

import com.kruzer.rma.Model.Rma;
import com.kruzer.rma.Repository.RmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class RestControll {
    RmaRepository rmaRepository;

    @Autowired
    public RestControll(RmaRepository rmaRepository) {
        this.rmaRepository = rmaRepository;
    }

    @GetMapping("/")
    public String readhome(){
        System.out.println("XXX");
        //rmaRepository.findAll();
        return "home";
    }

    @PostMapping("/")
    public String addhome(@RequestBody Rma rma){
        //rmaRepository.save(rma);
        return "home";
    }
}
