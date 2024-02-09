package com.sam.SpringBootDemo.repository;

import com.sam.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void Save(Laptop laptop){
        // all jdbc logic goes here

        System.out.println("Laptop Saved");
    }
}
