package org.example.springlearn;

import org.springframework.stereotype.Component;

@Component
public class GPU implements MotherboardComponent {

    public GPU(){
    }

    @Override
    public void work() {
        //Rough activity
    }
}
