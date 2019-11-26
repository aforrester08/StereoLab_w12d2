import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RecordPlayerTest {

    RecordDeck recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordDeck("Panasonic", "Z1");
    }

    @Test
    public void canGetMake() {
        assertEquals("Panasonic", recordPlayer.getMake());
    }
    @Test
    public void canGetPlaySpeed() {
        assertEquals(45, recordPlayer.getPlaySpeed());
    }
}
