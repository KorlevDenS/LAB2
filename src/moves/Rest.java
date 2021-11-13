package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super();
        type = Type.PSYCHIC;
    }

    protected void applySelfEffects(Pokemon pok){
        pok.setCondition(new Effect().condition(Status.SLEEP).turns(2));
        pok.restore();
    }

    protected String  describe() {
        return "использует Rest";
    }
}
