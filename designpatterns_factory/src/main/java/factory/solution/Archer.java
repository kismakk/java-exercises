package designpatterns_factory.src.main.java.factory.solution;

public class Archer extends Character {
    public Archer(String name) {
        super(name);
        this.health = 75;
        this.attackPower = 15;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " uses Arrow Rain!");
    }
}