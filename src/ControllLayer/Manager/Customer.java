/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer.Manager;

/**
 *
 * @author Malakagl
 */
public class Customer {

    String ID;
    String name;
    String addressCity;
    String addressStreet;
    String addressNumber;
    String email;
    String type;

    public Customer() {
    }

    public Customer(String id, String Name, String AddressCity,
            String AddressStreet, String AddressNumber,
            String Email, String Type) {
        ID = id;
        name = Name;
        addressCity = AddressCity;
        addressStreet = AddressStreet;
        addressNumber = AddressNumber;
        email = Email;
        type = Type;
    }
}
