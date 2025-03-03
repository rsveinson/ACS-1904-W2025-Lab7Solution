import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Lab 7 Person
 * @Sveinson 
*/

public class Person implements Passenger, Comparable<Person>{
    
    private String firstName;
    private String lastName;
    private int age;
    
    // constructors
    public Person(String fn, String ln, int a){
        firstName = fn;
        lastName = ln;
        age = a;
    }// end constructor
    
    // getters
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    //required method implementations from Passenger
    /*****************************************
    * Description: get the full name of a Person object
    * 
    * @return       String catenatin of firstName and lastName
    * ****************************************/
    public String getName(){
        return firstName + " " + lastName;
    } // end getname()
    
    /*****************************************
    * Description: computes the type of fare the passenger will pay
    * 
    * @return       String type of fare, regular, youth or senior
    * ****************************************/
    public String getFareType(){
        String ft;
     
        if(age < YOUTHAGE)
            ft = "Youth";
        else if(age <= SENIORAGE)
            ft = "Regular";
        else
            ft = "Senior";
            
        return ft;
    }
    
    // required from Comparable
    /* there will be a few different implementations 
     * to order the list differently based on variations of name
     */
    // alphabetical by last name
    // public int compareTo (Person p) {
        // return lastName.compareTo(p.lastName);
    // }
    
    // reverse alphabetical by last name
    // public int compareTo (Person p) {
        // return p.lastName.compareTo(lastName);
    // }
    
    // alphabetical by last name then first name
    public int compareTo (Person p) {
        String s = lastName + firstName;
        String o = p.lastName + p.firstName;
        return s.compareTo(o);
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
