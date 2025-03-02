import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Lab 7 Driver
 * @Sveinson 
*/

public class TrainDriver{
    public static void main(String[] args)throws FileNotFoundException {
        // create a new train
        Train train = new Train("Planet Express");
        
        // create some person/pasengers
        train.addPassenger(new Person("Philip", "Fry", 17));
        train.addPassenger(new Person("Hermes", "Conrad", 21));
        train.addPassenger(new Person("Kif", "Kroker", 15));
        train.addPassenger(new Person("Zapp", "Branningan", 35));
        train.addPassenger(new Person("Bender", "Rodriguez", 53));
        train.addPassenger(new Person("Turanga", "Leela", 72));
        train.addPassenger(new Person("Hubert", "Farnsworth", 102));
        train.addPassenger(new Person("Yancy", "Fry", 23));
        train.addPassenger(new Person("Turanga", "Leela", 72));
        train.addPassenger(new Person("Dwight", "Conrad", 12));
        train.addPassenger(new Person("Cubert", "Farnsworth", 12));
        
        // display the pasenger list
        System.out.println("Train Name: " + train.getName());
        
        System.out.println(train.displayPassengers());
        


        System.out.println("\nend of program");
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
