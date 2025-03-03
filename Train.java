import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Lab 7 Train
 * @Sveinson 
*/

public class Train{
    
    private String name;
    private ArrayList<Passenger> passengers;
    
    // constructors
    public Train(){
        name = "unknown";
        passengers = new ArrayList();
    }
    
    public Train(String n){
        name = n;
        passengers = new ArrayList();
    }
    
    // getters
    /*****************************************
    * Description: get the name of the train
    * 
    * @return       String name, the name of the train
    * ****************************************/
    public String getName(){
        return name;
    } // end get name;
    
    // setters
    
    // other
    /*****************************************
    * Description: print a list of passengers along with their fare type
    * 
    * ****************************************/
    public String displayPassengers(){
        StringBuilder st = new StringBuilder();
        
        st.append("\nPassengers:\n");
        
        for(Passenger p: passengers){
            st.append(p.getFareType() + "\t");
            st.append(p.getName() + "\n");
        }
        
        return st.toString();
    }// end display passenhers
    
    /*****************************************
    * Description: add a passenger to the list of passengers
    * 
    * @param        Passenger p, the passenger to be added.
    * ****************************************/
    public void addPassenger(Passenger p){
        passengers.add(p);
    }// end addPassenger
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
