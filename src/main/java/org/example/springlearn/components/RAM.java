package org.example.springlearn.components;

import org.example.springlearn.config.motherboard.MotherboardComponent;
import org.springframework.stereotype.Component;

@Component
public class RAM implements MotherboardComponent {
    public RAM() {
    }

    @Override
    public void work(){
        //Rough activity
    }
}
