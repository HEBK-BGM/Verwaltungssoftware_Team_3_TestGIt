import java.util.Scanner;

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;
    int i;
    Scanner sc = new Scanner(System.in);
    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        benutzer.spielfestlegen();
        benutzer.spielfestlegen();
    }

}
