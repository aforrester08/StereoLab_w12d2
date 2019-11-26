public class CDplayer extends Component{

    private String make;
    private String model;
    private Integer numOfCDs;

    public CDplayer(String make, String model, Integer numOfCds) {
        super(make, model);
        this.numOfCDs = numOfCds;
    }

    public int getNumOfCDs() {
        return this.numOfCDs;
    }


}
