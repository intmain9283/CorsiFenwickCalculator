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
public class Calculations {
    public static int calculateCorsiFor(int shotsFor, int blockedShotsFor, 
            int missedShotsFor){
        return shotsFor + blockedShotsFor + missedShotsFor;
    }
    
    public static int calculateCorsiAgainst(int shotsAgainst, 
            int blockedShotsAgainst, int missedShotsAgainst){
        return shotsAgainst + blockedShotsAgainst + missedShotsAgainst;
    }
    
    public static int calculateCorsi(int corsiFor, int corsiAgainst){
        return corsiFor - corsiAgainst;
    }
    
    public static int calculateFenwickFor(int shotsFor, int missedShotsFor) {
        return shotsFor + missedShotsFor;
    }
    
    public static int calculateFenwickAgainst(int shotsAgainst, 
            int missedShotsAgainst) {
        return shotsAgainst + missedShotsAgainst;
    }
    
    public static int calculateFenwick(int fenwickFor, int fenwickAgainst){
        return fenwickFor - fenwickAgainst;
    }
}
