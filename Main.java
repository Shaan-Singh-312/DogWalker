import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
/*
        // Make company and print
        DogWalkCompany c = new DogWalkCompany();
        System.out.println(c);

        // Add dogs
        int hour = c.addDogs();
        System.out.println(c);

        //Make Dog walker and have hem walk dog at time: hour
        DogWalker w = new DogWalker(4,c);
        System.out.println(w.walkDogs(hour) + " dogs walked");
        System.out.println(c.numAvailableDogs(hour));

        //Add dogs in sequence 7-3,8-2,9-2,10-3
        for (int i =7; i < 11;i++ ){
            c.addDogs();
        }
        System.out.println(c);

        //Calculate how much a Dogwalker earns in one shift
        w = new DogWalker(3,c);
        System.out.println("$" + w.dogWalkShift(7,10) + ".00 earned");
*/
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);

        ArrayList<DogWalkCompany> d= new ArrayList<>();
        for (int i = 0; i <1000; i++){
            ArrayList<Integer> y = new ArrayList<>();
            for (int j = 0; j<24; j++){
                int x = s.nextInt();
                y.add(x);
            }
            d.add(new DogWalkCompany(i,y));
        }


        f= new File("Walkers.txt");
        Scanner b = new Scanner(f);
        int sum = 0;
        int avg = 0;
        for (int i = 0; i<10000; i++){
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int j =0; j < 4; j++){
                arr2.add(b.nextInt());
            }
            DogWalker w = new DogWalker(arr2.get(0),d.get(arr2.get(1)), arr2.get(2), arr2.get(3));
            sum += w.dogWalkShift();

            avg += arr2.get(0);
        }

        System.out.println(sum);
        System.out.println();


    }
}