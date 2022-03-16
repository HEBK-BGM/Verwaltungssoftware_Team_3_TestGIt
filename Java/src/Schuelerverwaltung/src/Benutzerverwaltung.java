

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;
    int i;


    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        menuefuehrung.zeigeMenue(benutzer);
        
    }

}
