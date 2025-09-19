//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
    }
}