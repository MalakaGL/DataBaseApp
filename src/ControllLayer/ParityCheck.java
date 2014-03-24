/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllLayer;

/**
 *
 * @author Malakagl
 */
public class ParityCheck {
    final static int id_size = 6; 
    
    public static boolean validate(String CustomerID){
        char key = CustomerID.charAt(id_size);
        char correct_key = ParityCheck.getKey(CustomerID);
        System.out.println("Key = "+key);
        System.out.println("Correct Key = "+correct_key);
        if ( key == correct_key){
            return true;
        }else{
            return false;    
        }
    }
    
    public static char getKey(String id){
        int sum = 0;
        for(int i=0; i<id_size; i++){
            char digit = id.charAt(i);
            System.out.println("Sum = "+sum);
            sum = (int)(sum + Character.getNumericValue(digit)*Math.pow(2,(i+1)));
        }
        sum = sum%26;
        System.out.println("Modulus Value = "+sum);
        return (char)(sum + 65);    
    }
    
    public static void main(String Args[]){
        System.out.println(ParityCheck.validate("111000O"));
    }
}
