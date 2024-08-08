package designpatterns_factory.src.main.java.factory.solution;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name) {
        this.name = name;
    }

    public abstract void specialAbility();
}