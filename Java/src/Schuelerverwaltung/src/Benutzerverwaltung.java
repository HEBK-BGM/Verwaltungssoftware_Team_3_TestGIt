

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;


    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        for (int i = 2; i>1; i++){
        menuefuehrung.zeigeMenue(benutzer);

        }
    }

}
