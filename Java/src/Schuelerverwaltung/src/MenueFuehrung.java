

public class MenueFuehrung {
    private int b = 1;

    
    //regestriere funktion ist selbsterklärend
    public Benutzer regestriere() {


        System.out.println("Bitte regestriere dich");
        System.out.println("Gib den Benutzernamen ein");
        String pBenutzername =Read.string();
        System.out.println("Gib das Passwort ein");
        String pPasswort = Read.string();
    
        System.out.println("Wiederhole das Passwort");
        String pPasswort2 = Read.string();
       //Passwörter werden verglichen das darüber muss aber dennoch da sein damit der STrin erstellt wird
    while (b==1) {

  
       
        if (pPasswort2.equals(pPasswort)) {
            b--;
        } else {
            System.out.println("Du hast das falsche Passwort eingegeben, bitte versuche es erneut.");
            System.out.println("Gib das Passwort ein");
            pPasswort = Read.string();
    
            System.out.println("Wiederhole das Passwort");
            pPasswort2 = Read.string();
            b=1;
        }
    }
       
        System.out.println("Gib dein Alter ein");
        int pAlter = Read.noString("Bitte versuch es erneut, gib dein Alter ein");
       System.out.println("Du bist jetzt regestriert");
       Read.absatz();
        
       //dadurch wird der Benutzer der oben in der Methode angegeben wird implementiert
            
       Benutzer pBenutzer = new Benutzer(pBenutzername, pAlter,  pPasswort);
       return pBenutzer;
    }
   
   
    // Das ist dafür dass mann wenn man angemeldet ist soll das dafür verwendet werden hat bisher keinen tieferen Sinn wird aber süäter wichtig
    public int start(){
        Read.absatz();
        System.out.println("Wähle aus:");
        System.out.println(" (1) Spiel anlegen:");
        System.out.println(" (2) Alle Spiele anzeigen:");
        System.out.println(" (3) Spiele Verwalten");
        System.out.println(" (4) Tic Tac Toe spielen");
        System.out.println(" (5) Abmelden");
               
        return Read.numberOSchleife();
    } 

    // Ausführung der Befehle von darüber ist auch akutell noch unwichtig
    public void zeigeMenue(Benutzer pBenutzer){
        while(pBenutzer.getAngemeldet() == true){
            Read.line();
            switch(start()){
                case 1: pBenutzer.spielfestlegen();
                        break;
                case 2: pBenutzer.spieleUswAusgeben();
                        break;
                case 3: pBenutzer.spielemenue();break;
                case 4: pBenutzer.menue(); break;
                case 5: pBenutzer.setangemeldet(false);//beendet die Schleife
                        break;
                        //Wenn man abgemeldet ist
                default: System.out.println("Wiederhole deine Eingabe");
            }   
        
        }
        abmeldungMenue(pBenutzer);
    }
    //wird ausgeführt wenn man abgemeldet wird zeigt dann das an
    public int anmeldenOderRegestrieren(){
        System.out.println("Du bist abgemeldet, wähle bitte aus:");
        System.out.println("(1) Anmelden");
        System.out.println("(2) Regestrieren/Account Daten überschreiben");
        System.out.println("(3) Programm beenden");
        return Read.numberOSchleife();
    }
    //wird ausgeführt wenn man abgemeldet wird 
    public void abmeldungMenue(Benutzer pBenutzer){
        while(pBenutzer.getAngemeldet() == false){
            Read.line();
            switch (anmeldenOderRegestrieren()){
                case 1: pBenutzer.anmeldung(); break;
                case 2: datenueberschreiben(pBenutzer); break; //hier kann nicht regestriere ausgeführt werden da wir nur die Werte verändern wollen und den Benutzer nicht überschreiben wollen bei regestriere() würden auch die Spiele
                case 3: Read.exit(); break;
                default: System.out.println("Bitte eingabe wiederholen");
            }
        }
    }
    //verändert die Werte von Benutzer ohne in neu zu initialisieren
    public void datenueberschreiben(Benutzer pBenutzer){
        pBenutzer.setbenutzername();
        pBenutzer.setpasswort();
        System.out.println("Bitte gib dein Alter ein");
        pBenutzer.setAlter(Read.noString("Bitte versuch es erneut, gib dein Alter ein"));
        
    }
}
  


