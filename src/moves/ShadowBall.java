package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.2) {
            pok.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    protected String describe(){
        return "использует Shadow Ball";
    }
}
