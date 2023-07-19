package koschei;

import koschei.models.Duck5;
import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;
    private Duck5 duck;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString() + duck.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
}
