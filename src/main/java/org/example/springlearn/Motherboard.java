package org.example.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Motherboard {
    @Autowired
    private CPU cpu;
    private RAM ram;
    private final GPU gpu;

    public Motherboard(GPU gpu) {
        this.gpu = gpu;
    }

    @Autowired
    public void setRam(RAM ram){
        this.ram = ram;
    }
}
