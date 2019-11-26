public class Stereo {

    private RecordDeck recordDeck;
    private CDplayer cDplayer;
    private String name;
    private Radio radio;

    public Stereo(String name, RecordDeck recordDeck, CDplayer cdPlayer, Radio radio) {
        this.name = name;
        this.cDplayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.radio = radio;
    }

    public String getName() {
        return name;
    }

    public CDplayer getcdPlayer() {
        return cDplayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }
}
