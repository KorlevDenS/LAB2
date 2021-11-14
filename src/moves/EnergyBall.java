package moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            pok.setMod(Stat.SPECIAL_DEFENCE, -1);
        }
    }

    protected String describe() {
        return "использует Energy Ball";
    }
}
