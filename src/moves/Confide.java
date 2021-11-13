package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super();
        type = Type.NORMAL;
    }

    protected void applyOppEffects(Pokemon poc) {
        poc.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    protected String describe() {
        return "использует Confide";
    }
}
