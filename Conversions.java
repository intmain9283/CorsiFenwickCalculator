/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corsifenwickcalculator;

/**
 *
 * author Vincent
 */
public class Conversions {
    public static int stringToNumber(String numStr) {
        int num = 0;
        try {
             num = Integer.parseInt(numStr);
            
            
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        return num = 0;
    }
    
    public static String numToString (int num) {
        return Integer.toString(num);
    }
}
