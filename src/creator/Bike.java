package creator;

public class Bike {

    private Wheel frontWheel, backWheel;
    private Frame frame;

    /* Finish the Bike class. You should be able to create a Bike
    object with two Wheel objects and a Frame object*/

    public Bike(float w, float l) {
        frontWheel = new Wheel(w);
        backWheel = new Wheel(w);
        frame = new Frame(l);
    }
}
