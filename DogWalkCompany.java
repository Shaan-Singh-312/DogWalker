import java.util.ArrayList;
import java.util.Scanner;
public class DogWalkCompany
{
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23
     */
    private ArrayList<Integer> schedule;

    public DogWalkCompany(ArrayList<Integer> f){
        schedule = f;
    }

    public String toString(){
        String s ="";
        for(int i = 0; i < schedule.size(); i++){
            s += i + " "+ schedule.get(i) + "\n";
        }
        return s;
    }

    public int addDogs(){
        Scanner s = new Scanner(System.in);
        System.out.println("What hour?");
        int hour = s.nextInt();
        System.out.println("How many dogs?");
        int dogs = s.nextInt();
        schedule.set(hour, dogs);
        return hour;
    }

    public int numAvailableDogs(int hour){ /* implementation not shown */
        return schedule.get(hour);
    }

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     * numberDogsWalked > 0
     */
    public void updateDogs(int hour, int numberDogsWalked) {
        schedule.set(hour, schedule.get(hour) - numberDogsWalked);
    }
}