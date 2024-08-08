package designpatterns_factory.src.main.java.factory.solution;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
        this.health = 100;
        this.attackPower = 10;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " uses Sword Slash!");
    }
}