import java.util.Scanner;

public class Benutzer extends Person{
    private String passwort;
    private String benutzername;
    Scanner sc = new Scanner(System.in);
    public void änderePasswort(String pPasswort){
        passwort = pPasswort;
    }

    public Benutzer(String pNutzername, int pAlter, String pPasswort){
        super(pAlter);
        passwort=pPasswort;
        benutzername=pNutzername;

    }
    public boolean anmeldung(){
    
        boolean b1 = false;
        while (b1 ==false) {
            System.out.println("Bitte gib deinen Benutzernamen ein");
            String  pBenutzername = sc.nextLine();
            System.out.println("Bitte gib dein Passwort ein");
            String pPasswort = sc.nextLine();
            System.out.println("Anmeldedaten werden überprüft...");
            if (pPasswort.equals(passwort)) {
                if (pBenutzername.equals(benutzername)){
                    b1 = true;
                    System.out.println("Anmeldedaten sind richtig sie sind jetzt angemeldet");
                } else {
                    System.out.println("Anmeldedaten sind falsch bitte versuche es erneut");
                  
                     b1=false;
                 }
                } else {
               System.out.println("Anmeldedaten sind falsch bitte versuche es erneut");
             
                b1=false;
            }
        }
        return b1;
    }

    public Spiel spielanlegen(Spiel pSpiel){
 
        return pSpiel;
    }
}

