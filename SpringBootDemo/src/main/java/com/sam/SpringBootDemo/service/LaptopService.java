package com.sam.SpringBootDemo.service;

import com.sam.SpringBootDemo.model.Laptop;
import com.sam.SpringBootDemo.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo laptopRepo;
    public void addLaptop(Laptop laptop){
        //generally you call the repository to add data to DB
        laptopRepo.Save(laptop);
    }
}
