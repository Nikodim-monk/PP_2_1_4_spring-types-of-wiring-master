package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck=new Duck5();

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }

}
