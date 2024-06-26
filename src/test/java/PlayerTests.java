// Copyright 2024 by Nedelin Dmitry
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTests {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testValues() {
        assertFalse(player.selected);
        assertFalse(player.win);
        assertEquals(0, player.move);

        player.selected = true;
        player.win = true;
        player.move = 5;
        assertTrue(player.selected);
        assertTrue(player.win);
        assertEquals(5, player.move);
    }

    @Test
    public void testSymbol() {
        player.symbol = 'X';
        assertEquals('X', player.symbol);

        player.symbol = 'O';
        assertEquals('O', player.symbol);
    }
}
