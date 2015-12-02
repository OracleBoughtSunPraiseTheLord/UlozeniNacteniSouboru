package ulozeninacteniobjektu;


/*
Třída pro definici položky v telefonním seznamu
 */
public class TelefonniSeznam {
    String jmeno;
    String prijmeni;
    long cislo;
    public String toString(){
        String vystup;
        
        vystup = "Jméno: " + this.jmeno +"\r\n";
        vystup += "Příjmení: " + this.prijmeni + "\r\n";
        vystup += "Telefonní číslo : " + this.cislo+ "\r\n";
        return (vystup);
    }
    
}
