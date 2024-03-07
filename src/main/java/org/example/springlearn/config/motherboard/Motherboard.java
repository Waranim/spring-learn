package org.example.springlearn.config.motherboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Motherboard {
    @Autowired
    @Qualifier("CPU")
    private MotherboardComponent cpu;
    private MotherboardComponent ram;
    private final MotherboardComponent gpu;

    public Motherboard(@Qualifier("createGpu") MotherboardComponent gpu) {
        this.gpu = gpu;
    }

    @Autowired
    @Qualifier("RAM")
    public void setRam(MotherboardComponent ram){
        this.ram = ram;
    }
}
