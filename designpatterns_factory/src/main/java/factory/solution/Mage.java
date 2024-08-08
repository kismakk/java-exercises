package designpatterns_factory.src.main.java.factory.solution;

public class Mage extends Character {
    public Mage(String name) {
        super(name);
        this.health = 50;
        this.attackPower = 20;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " uses Fireball!");
    }
}