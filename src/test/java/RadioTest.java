import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio();
    }
    @Test
    public void canTune() {
        assertEquals("You are tuned to Radio 1", radio.tune("Radio 1"));
    }
}
