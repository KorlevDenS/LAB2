package moves;

import ru.ifmo.se.pokemon.*;

public class Liquidation extends SpecialMove {
    public Liquidation() {
        super(Type.WATER, 85, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.2) {
            pok.setMod(Stat.DEFENSE, -1);
        }
    }

    protected String describe() {
        return "использует Liquidation";
    }
}
