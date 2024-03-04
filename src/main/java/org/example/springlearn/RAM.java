package org.example.springlearn;

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
