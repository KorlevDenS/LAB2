import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab02 {
    public static void main(String[] args){
        Battle battle = new Battle();
        JangmoO pok1 = new JangmoO("Егор", 3);
        Mudbray pok2 = new Mudbray("Саня", 2);
        Mudsdale pok3 = new Mudsdale("Олег", 5);
        Solosis pok4 = new Solosis("Энтони", 4);
        Duosion pok5 = new Duosion("Спарки", 6);
        Reuniclus pok6 = new Reuniclus("Влад", 2);
        battle.addAlly(pok1);
        battle.addAlly(pok2);
        battle.addAlly(pok3);
        battle.addFoe(pok4);
        battle.addFoe(pok5);
        battle.addFoe(pok6);
        battle.go();
    }
}
