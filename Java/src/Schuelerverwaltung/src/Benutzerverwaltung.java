

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;


    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        menuefuehrung.zeigeMenue(benutzer);
        
    }

}
