import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    private MP3 mp3;
    private Stereo stereo;
    private CDplayer cDplayer;
    private String name;
    private Radio radio;

    @Before
    public void before() {
        mp3 = new MP3();
        RecordDeck recordDeck = new RecordDeck("Panasonic", "X2");
        CDplayer cDplayer = new CDplayer("Samsung", "Z1", 7);
        Radio radio = new Radio();
        stereo = new Stereo("Raff", recordDeck, cDplayer, radio);
    }

    @Test
    public void canConnect() {
        assertEquals("Raff", stereo.getName());
    }
}
