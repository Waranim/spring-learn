package org.example.springlearn;

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
