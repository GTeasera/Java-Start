import java.util.Vector;

public class Parking {

    private int index;
    private String car;


    Parking(int ID, String CAR){
        this.index = ID;
        this.car = CAR;
    }

    public String GetCar(){
        return this.car;
    }

    public int GetID(){
        return this.index;
    }


}
