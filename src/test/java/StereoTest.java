import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before() {
        RecordDeck recordDeck = new RecordDeck("Panasonic", "X2");
        CDplayer cDplayer = new CDplayer("Samsung", "Z1", 7);
        Radio radio = new Radio();
        stereo = new Stereo("Raff", recordDeck, cDplayer, radio);
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(45, stereo.getRecordDeck().getPlaySpeed());
    }
    @Test
    public void canGetNumOfCDs() {
        assertEquals(7, stereo.getcdPlayer().getNumOfCDs());
    }
    @Test
    public void canTuneRadio() {
        assertEquals("You are tuned to Radio 1", stereo.getRadio().tune("Radio 1"));
    }
    @Test
    public void canGetModelfCDPLayer() {
        assertEquals("Z1", stereo.getcdPlayer().getModel());
    }
    @Test
    public void canGetModelfRecord() {
        assertEquals("X2", stereo.getRecordDeck().getModel());
    }
}
