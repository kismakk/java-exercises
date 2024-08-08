package designpatterns_factory.src.main.java.factory.solution;

/*
 * Simple factory implementation that creates characters based on the type.
 */
public class SimpleCharacterFactory implements CharacterFactory {

    @Override
    public Character createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "warrior":
                return new Warrior(name);
            case "mage":
                return new Mage(name);
            case "archer":
                return new Archer(name);
            default:
                throw new IllegalArgumentException("Invalid character type: " + type);
        }
    }
}