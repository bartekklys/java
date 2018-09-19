package pl.bartekk.solidPrinciples;

/**
 * I - Interface Segregation Principle
 * many client specific interfaces are better than one general interface
 */
public class ISP {

    /**
     * Example
     * RestaurantInterface interface BREAKS the Interface Segregation Principle
     */
    public interface RestaurantInterface {
        public  void acceptOnlineOrder();
        public  void takeTelephoneOrder();
        public  void payOnline();
        public  void walkInCustomerOrder();
        public  void payInPerson();
    }
}
