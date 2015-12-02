
package ulozeninacteniobjektu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UlozeniNacteniObjektu {

    public static void main(String[] args) {

       
        TelefonniSeznam polozka1;
        polozka1 = new TelefonniSeznam();
        polozka1.jmeno = "René";
        polozka1.prijmeni = "Huzva";
        polozka1.cislo = 608123456;
        
        System.out.println(polozka1);
       BufferedWriter bw;
        try {
            bw = new BufferedWriter(
                    new FileWriter("f:/pokus.txt"));
            bw.write(polozka1.toString());
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(UlozeniNacteniObjektu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
