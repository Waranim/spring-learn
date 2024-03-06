package org.example.springlearn.components;

import org.example.springlearn.config.motherboard.MotherboardComponent;
import org.springframework.stereotype.Component;

@Component
public class CPU implements MotherboardComponent {
    public CPU() {
    }


    @Override
    public void work(){
        //Rough activity
    }
}
