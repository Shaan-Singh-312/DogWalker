import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(read());
    }

    public static int read() throws FileNotFoundException {
        int money = 0;
        File f = new File("Companies.txt");
        Scanner s = new Scanner(f);

        DogWalkCompany[] companies = new DogWalkCompany[1000];
        int index = 0;
        while (s.hasNextInt()) {
            int[] dogs = new int[24];
            for (int i = 0; i < dogs.length; i++) {
                dogs[i] = s.nextInt();
            }
            companies[index] = new DogWalkCompany(dogs);
            index++;
        }

        DogWalker[] walkers = new DogWalker[(int) Math.pow(10, 4)];
        f = new File("Walkers.txt");
        s.close();
        s = new Scanner(f);
        index = 0;

        while (s.hasNextInt()) {
            int dogs = s.nextInt();
            DogWalkCompany company = companies[s.nextInt()];
            walkers[index] = new DogWalker(dogs, company);
            money += walkers[index].dogWalkShift(s.nextInt(), s.nextInt());
            index++;

        }


        return money;
    }
}