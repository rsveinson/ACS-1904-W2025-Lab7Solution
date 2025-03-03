        
/**
 * Passenger interface: supplies required methods for name and fareTyep
 *                      for potential passengers on the Planet Express Train
 *                      
 *
 * @author Sveinson
 * @version ACS-1904 Lab 7
 */
public interface Passenger
{
    /* could also declare these constants in Person
     * or in some utility class
     * remember that these are automatically public static final
     * Since these values are tied to the getFareType method this
     * seems like an appropriate place for them.
     */
    // some constants
    int YOUTHAGE = 18;      // youth fare upper limit
    int SENIORAGE = 65;     // senrior fare lower limit
    /**
     * getName()
     *
     * @return   String passenger's name
     */
    String getName();
    
    /**
     * getFareType()
     *
     * @param   int age:    person's age
     * @return   String fareType,   Regular for adults, Yout for under 18,
     *                              Senior for over 65
     *                              
     */
    String getFareType();
}
