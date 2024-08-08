package designpatterns_factory.src.main.java.factory.solution;

public class Game {
    private CharacterFactory characterFactory;

    public Game(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public Character createCharacter(String type, String name) {
        return characterFactory.createCharacter(type, name);
    }
}
