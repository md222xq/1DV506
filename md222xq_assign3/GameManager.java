package md222xq_assign3;

public class GameManager {
    public static void main(String[] args) {

        Weapon sword = new Weapon("Knight Sword", 40);
        Hero hero = new Hero("Hero", 100, sword);
        Enemy goblin = new Enemy("Goblin", 250);
        GameMechanics round1 = new GameMechanics();
        round1.startGame(hero, goblin);



    }
}