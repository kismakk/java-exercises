package designpatterns_factory.src.main.java.factory.solution;

/*
 * Factory interface for creating characters.
 * 
 */
public interface CharacterFactory {
    Character createCharacter(String type, String name);
}