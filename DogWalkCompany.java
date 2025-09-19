public class DogWalkCompany
{
    /**
     * Returns the number of dogs, always greater than 0, that are available
     * for a walk during the time specified by hour
     * Precondition: 0 <= hour <= 23
     */
    private int[] schedule;

    public DogWalkCompany(){
        schedule = new int[24];
    }

    public String toString() {
        String s ="";
        for(int i = 0; i < schedule.length; i++){
            s += i + " "+ schedule[i] + "\n";
        }
        return s;
    }

    public int numAvailableDogs(int hour)
    { /* implementation not shown */
    return 0;}

    /**
     * Decreases, by numberDogsWalked, the number of dogs available for a walk
     * during the time specified by hour
     * Preconditions: 0 <= hour <= 23
     * numberDogsWalked > 0
     */
    public void updateDogs(int hour, int numberDogsWalked)
    {

    }

/* There may be instance variables, constructors,
and methods that are not shown. */
}