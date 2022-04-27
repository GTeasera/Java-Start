// import java.io.IOException;
// import java.util.Scanner;
import java.util.*;

public class Start {
    public static void main(String[] args) /*throws IOException*/ {

        /*Computer apple = new Computer();

        apple.cpu = 1000;
        apple.memory = 2000;
        apple.name = "M1 Air";

        int test = apple.setCPU(123);
        System.out.println(test);

        for(int i = 100; i < 1000; i++) {
            if(i % 5 == 0 && i % 2 != 0){
                System.out.println(i);
            }
        }

        int arr[] = new int[3];
        int table[][] = new int [3][3];

        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(table[i][i]);
            }
        }

        char ch, answer = 'B';
        boolean fin = false;

        while(fin == false) {
            System.out.println("Answer word:" + answer);
            System.out.println("Your word: ");
            ch = (char) System.in.read();
            if(ch == answer) {
                fin = true;
            }
        }
        System.out.println("You win!");

        int[] arr = new int[900];
        int[] new_arr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        for(int j = new_arr.length-1; j > 0; j--){
            new_arr[j] = j;
        }

        for(int element : arr){
            System.out.println("S : " + element);
        }

        for(int element : new_arr){
            System.out.println("N : " + element);
        }
    }*/

        Parking lamba = new Parking(1,"Lamba");
        Parking merce = new Parking(2,"Merce");
        Parking ferrari = new Parking(3,"Ferrari");
        Parking bmw = new Parking(4,"BMW");

        ArrayList<String> myGarage = new ArrayList<String>();


        myGarage.add(lamba.GetCar());
        myGarage.add(ferrari.GetCar());
        myGarage.add(merce.GetCar());
        myGarage.add(bmw.GetCar());

        System.out.println(myGarage);

//        addGarage(lamba, myGarage);
//        addGarage(merce, myGarage);
//        addGarage(ferrari, myGarage);

    }
    public static void addGarage(Parking parking, ArrayList<String> myGarage){
        myGarage.add(parking.GetCar());
    }
}
