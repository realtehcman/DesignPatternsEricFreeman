package action_adventure_game;

import action_adventure_game.algorithms.SwordBehavior;
import action_adventure_game.client.characters.Character;
import action_adventure_game.client.characters.King;
import action_adventure_game.client.characters.Queen;

public class Adventure {
    public static void main(String[] args) {
        Character king = new King();
        king.performWeaponBehavior();
        king.fight();

        Queen queen = new Queen();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.performWeaponBehavior();
        queen.fight();

    }
}
