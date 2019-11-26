public class RecordDeck extends Component{

    private String make;
    private String model;
    private Integer playSpeed;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.playSpeed = 45;
    }

    public int getPlaySpeed(){
        return this.playSpeed;
    }


}
