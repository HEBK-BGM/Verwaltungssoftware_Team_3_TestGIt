import java.util.Scanner;

public class MenueFuehrung {
    Scanner sc = new Scanner(System.in);
    Spiel spiel;
    int i = 1;
    public Benutzer regestriere() {
        int b = 1;

    
        System.out.println("Gib den Benutzernamen ein");
        String pBenutzername = sc.nextLine();
        System.out.println("Gib das Passwort ein");
        String pPasswort = sc.nextLine();

        System.out.println("Gib das Passwort erneut ein");
        String pPasswort2 = sc.nextLine();
       
    while (b==1) {

  
       
        if (pPasswort2.equals(pPasswort)) {
            b--;
        } else {
            System.out.println("Du hast das falsche Passwort eingegeben, bitte versuche es erneut.");
            System.out.println("Gib das Passwort ein");
            pPasswort = sc.nextLine();
    
            System.out.println("Gib das Passwort erneut ein");
            pPasswort2 = sc.nextLine();
            b=1;
        }
}
       
        System.out.println("Gib dein Alter ein");
        int pAlter = Integer.valueOf(sc.nextLine());
       

        
       
            
       Benutzer pBenutzer = new Benutzer(pBenutzername, pAlter,  pPasswort);

       return pBenutzer;
    }

    public boolean anmelden(Benutzer pBenutzer){
       return pBenutzer.anmeldung();

    }
    public int start(){
        System.out.println("");
        System.out.println("Wählen Sie aus:");
        System.out.println(" (1) Spiel anlegen:");/*
        System.out.println(" (2) Note für Fach anlegen:");
        System.out.println(" (3) Alle Fächer und Noten ausgeben");
        */
        System.out.println(" (4) Abmelden");
               
        return Integer.valueOf(sc.nextLine());
    }
    public void zeigeMenue(Benutzer pBenutzer){
        while(anmelden(pBenutzer) == true){
                System.out.println("-----------");
                switch(start()){
                    case 1: 
                            break;/*
                    case 2: noteAnlegen(pSchuelerverwaltung.getSchueler());
                            break;
                    case 3: pSchuelerverwaltung.getSchueler().alleFaecherAusgeben();
                            break;
                    case 4: abmeldung(pSchuelerverwaltung);
                            break;*/
                    default: System.out.println("Bitte eingabe wiederholen");
                }
            }  
            
       
       
        



        }}
    /** 
    public String anmeldung(){
        breakLine();
        System.out.println("Bitte geben Sie ihr Passwort ein!");

        String ret = sc.next();

        return ret;
    }
    public void abmeldung( Schuelerverwaltung pSchuelerverwaltung){
        breakLine();
        pSchuelerverwaltung.abmeldung();
        System.out.println("Sie werden abgemeldet");
        
    }

    public void zeigeFaecher(Schueler pSchueler){
        breakLine();
        pSchueler.alleFaecherAusgeben();
        breakLine();
    }

    public Fach fachAnlegen(){
        breakLine();
        System.out.println("Bitte Fachnamen angeben");
        String pName = sc.next();

        Fach ret = new Fach(pName);

        return ret;
    }

    public int start(){
        breakLine();
        System.out.println("Wählen Sie aus:");
        System.out.println(" (1) Fach anlegen:");
        System.out.println(" (2) Note für Fach anlegen:");
        System.out.println(" (3) Alle Fächer und Noten ausgeben");
        System.out.println(" (4) Abmelden");
        
        return sc.nextInt();
    }


    public void noteAnlegen(Schueler pSchueler){
        breakLine();
        System.out.println("Für welches Fach wollen Sie eine Note anlegen?");
        pSchueler.alleFachNamenMitNummernAusgeben();
        System.out.println("Bitte Fachnummer angeben");
        int nummer = sc.nextInt();

        pSchueler.noteFuerFachAnlegen(nummer, noteAbfragen());
    }

    private Note noteAbfragen(){
        breakLine();
        System.out.println("Wie lautet die Note:");
        int pNote = sc.nextInt();

        System.out.println("Wie lautet das Jahr:");
        int pJahr = sc.nextInt();

        Note note = new Note(pNote, pJahr);

        return note;
    }

*/
    
    /*

    public void zeigeMenue(Schuelerverwaltung pSchuelerverwaltung){
        while(pSchuelerverwaltung.getAngemeldet() == true){
            System.out.println("-----------");
            switch(start()){
                case 1: pSchuelerverwaltung.getSchueler().fachAnlegen(fachAnlegen());
                        break;
                case 2: noteAnlegen(pSchuelerverwaltung.getSchueler());
                        break;
                case 3: pSchuelerverwaltung.getSchueler().alleFaecherAusgeben();
                        break;
                case 4: abmeldung(pSchuelerverwaltung);
                        break;
                default: System.out.println("Bitte eingabe wiederholen");
            }
        }
        
   }
   */


