public abstract class Component implements IPlay {

    protected String make;
    protected String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String play(String album) {
        return album + " is playing";
    }

    public String getModel(){
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

}
