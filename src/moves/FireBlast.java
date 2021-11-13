package moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            Effect.burn(pok);
        }
    }

    protected String describe() {
        return "использует Fire Blast";
    }
}
