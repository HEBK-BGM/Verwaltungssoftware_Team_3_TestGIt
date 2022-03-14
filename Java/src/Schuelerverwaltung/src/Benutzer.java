import java.util.Scanner;

public class Benutzer extends Person{
    private String passwort;
    private String benutzername;
    int i;
    private Spiel[] spiel = new Spiel[i];
    Scanner sc = new Scanner(System.in);
    // Wir erstellen die Spiele für Benutzer damit wir das dem Benutzer zu ordnen
    public void änderePasswort(String pPasswort){
        passwort = pPasswort;
    }

    public Benutzer(String pNutzername, int pAlter, String pPasswort){
        super(pAlter);
        passwort=pPasswort;
        benutzername=pNutzername;

    }
    //Anmelde Funktion relativ simpel eigentlich genau so wie die while schleife in regestriere in menuefuehrung
    public boolean anmeldung(){
    
        boolean b1 = false;
        while (b1 ==false) {
            System.out.println("Bitte gib deinen Benutzernamen ein");
            String  pBenutzername = sc.nextLine();
            System.out.println("Bitte gib dein Passwort ein");
            String pPasswort = sc.nextLine();
            System.out.println("Anmeldedaten werden überprüft...");
            //wenn passwort und bejutzername richtig sind vergleich
            if (pPasswort.equals(passwort)) {
                if (pBenutzername.equals(benutzername)){
                    //beides richtig = true
                    b1 = true;
                    System.out.println("Anmeldedaten sind richtig sie sind jetzt angemeldet");
                } //wennn eines von beiden falsch ist dann passiert das
                else {
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
    //Wir legen auch ein Spiel in Benutzer an
    public Spiel spielanlegen(){
        System.out.println("Bitte gib den Namen des Spiels ein");
        String pName= sc.nextLine();
        System.out.println("Bitte gib das Kaufhahr des Spiels ein");
        int pKaufjahr = Integer.valueOf(sc.nextLine());
        Spiel pSpiel = new Spiel(pName, pKaufjahr);
        return pSpiel;
    }
    public void spielfestlegen(){
        spiel[i] = spielanlegen();
        System.out.println(spiel[i].getname());
        i++;
        
    }
}

