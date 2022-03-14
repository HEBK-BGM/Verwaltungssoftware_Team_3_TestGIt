

public class MenueFuehrung {
    
    Spiel spiel;
    int i = 1;

    //regestriere funktion ist selbsterklärend
    public Benutzer regestriere() {
        int b = 1;

    
        System.out.println("Gib den Benutzernamen ein");
        String pBenutzername =Read.string();
        System.out.println("Gib das Passwort ein");
        String pPasswort = Read.string();

        System.out.println("Gib das Passwort erneut ein");
        String pPasswort2 = Read.string();
       //Passwörter werden verglichen das darüber muss aber dennoch da sein damit der STrin erstellt wird
    while (b==1) {

  
       
        if (pPasswort2.equals(pPasswort)) {
            b--;
        } else {
            System.out.println("Du hast das falsche Passwort eingegeben, bitte versuche es erneut.");
            System.out.println("Gib das Passwort ein");
            pPasswort = Read.string();
    
            System.out.println("Gib das Passwort erneut ein");
            pPasswort2 = Read.string();
            b=1;
        }
}
       
        System.out.println("Gib dein Alter ein");
        int pAlter = Read.number();
       

        
       //dadurch wird der Benutzer der oben in der Methode angegeben wird implementiert
            
       Benutzer pBenutzer = new Benutzer(pBenutzername, pAlter,  pPasswort);

       return pBenutzer;
    }
    //wird noch nicht verwendet wird aber vlt. noch gebraucht funktion wird noch über benutzer.anmeldung() ausgeführt geht aber auch hierrüber
    public boolean anmelden(Benutzer pBenutzer){
       return pBenutzer.anmeldung();

    }
    // Das ist dafür dass mann wenn man angemeldet ist soll das dafür verwendet werden hat bisher keinen tieferen Sinn wird aber süäter wichtig
    public int start(){
        System.out.println("");
        System.out.println("Wählen Sie aus:");
        System.out.println(" (1) Spiel anlegen:");
        System.out.println(" (2) Alle Spiele anzeigen:");
        System.out.println(" (3) Spiele Verwalten");
        System.out.println(" (4) Abmelden");
               
        return Read.number();
    } 

    // Ausführung der Befehle von darüber ist auch akutell noch unwichtig
    public void zeigeMenue(Benutzer pBenutzer){
        while(pBenutzer.getAngemeldet() == true){
                System.out.println("-----------");
                switch(start()){
                    case 1: pBenutzer.spielfestlegen();
                            break;
                    case 2: pBenutzer.spieleanzeigen();
                            break;
                    case 3: pBenutzer.menueanzeigen();
                    case 4: pBenutzer.setangemeldet(false);;
                            break;
                    default: System.out.println("Bitte eingabe wiederholen");
                }
            }
    
            
       
       
        



        }}
  


