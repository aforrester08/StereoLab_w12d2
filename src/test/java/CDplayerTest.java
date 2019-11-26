import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CDplayerTest {

    CDplayer player;

    @Before
    public void before() {
        player = new CDplayer("Panasonic", "X2", 5);
    }

    @Test
    public void canGetNumOfCDs() {
        assertEquals(5, player.getNumOfCDs());
    }
    @Test
    public void canGetMake() {
        assertEquals("Panasonic", player.getMake());
    }
}
