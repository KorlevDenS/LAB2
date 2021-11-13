package moves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            Effect.confuse(pok);
        }
    }

    protected String describe() {
        return "использует Confusion";
    }
}
