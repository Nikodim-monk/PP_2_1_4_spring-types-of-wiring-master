package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private Egg6 egg = new Egg6();

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
