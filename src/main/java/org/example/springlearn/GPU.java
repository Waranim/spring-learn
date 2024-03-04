package org.example.springlearn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GPU implements MotherboardComponent {

    public GPU(){
    }

    @Override
    public void work() {
        //Rough activity
    }
}
