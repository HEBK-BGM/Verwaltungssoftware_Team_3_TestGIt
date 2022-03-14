import java.util.Scanner;

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;
    int i;
    Scanner sc = new Scanner(System.in);
    private Spiel[] spiel = new Spiel[10];
    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        benutzer.spielanlegen();
    }
    public Benutzer getbenutzer(){
        return benutzer;
    }
    public Spiel spielAnlegen(){
       
        System.out.println("Bitte Fachnamen angeben");
        String pName = sc.next();
        
        Spiel spiel = new Spiel(pName);

        return ret;
    }
}
