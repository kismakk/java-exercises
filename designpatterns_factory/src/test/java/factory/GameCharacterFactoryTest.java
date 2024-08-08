package designpatterns_factory.src.test.java.factory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import designpatterns_factory.src.main.java.factory.solution.*;
import designpatterns_factory.src.main.java.factory.solution.Character;

public class GameCharacterFactoryTest {
    private Game game;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        CharacterFactory factory = new SimpleCharacterFactory();
        game = new Game(factory);
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testWarriorCreation() {
        String name = "Thorgar Ironheart";
        Character warrior = game.createCharacter("warrior", name);
        assertNotNull(warrior);
        assertTrue(warrior instanceof Warrior);

        warrior.specialAbility();

        String output = outputStream.toString().trim();
        assertTrue(output.contains(name),
                "Special ability output should contain the character's name");
    }

    @Test
    void testMageCreation() {
        String name = "Lyra Moonshadow";
        Character mage = game.createCharacter("mage", name);
        assertNotNull(mage);
        assertTrue(mage instanceof Mage);

        mage.specialAbility();

        String output = outputStream.toString().trim();
        assertTrue(output.contains(name),
                "Special ability output should contain the character's name");
    }

    @Test
    void testArcherCreation() {
        String name = "Sylvan Swiftshadow";
        Character archer = game.createCharacter("archer", name);
        assertNotNull(archer);
        assertTrue(archer instanceof Archer);

        archer.specialAbility();

        String output = outputStream.toString().trim();
        assertTrue(output.contains(name),
                "Special ability output should contain the character's name");
    }

    @Test
    void testInvalidCharacterType() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.createCharacter("invalid", "Test");
        });
    }
}
