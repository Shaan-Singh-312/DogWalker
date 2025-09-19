public class DogWalker
{
    /** The maximum number of dogs this walker can walk simultaneously
     per hour */
    private int maxDogs;

    /** The dog-walking company this dog walker is associated with */
    private DogWalkCompany company;

    /**
     * Assigns max to maxDogs and comp to company
     * Precondition: max > 0
     */
    public DogWalker(int max, DogWalkCompany comp) { /* implementation not shown */
        company = comp;
        maxDogs = max;
    }

    /**
     * Takes at least one dog for a walk during the time specified by
     * hour, as described in part (a)
     * Preconditions: 0 <= hour <= 23
     * maxDogs > 0
     */
    public int walkDogs(int hour) { /* to be implemented in part (a) */
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs){
            company.updateDogs(hour,dogs);
            return dogs;
        }
        else{
            company.updateDogs(hour,maxDogs);
            return maxDogs;
        }
    }

    public int dogWalkShift(int startHour, int endHour){
        int pay = 0;
        while (startHour <= endHour){
            int dogs = walkDogs(startHour);
            pay += dogs *5;

            if (dogs == maxDogs || startHour >= 9 && endHour <= 17){
                pay += 3;
            }
            startHour ++;

        }
        return pay;
    }

}