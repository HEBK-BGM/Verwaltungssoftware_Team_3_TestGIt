

public class Benutzerverwaltung {
    private Benutzer benutzer;
    private MenueFuehrung menuefuehrung;


    public Benutzerverwaltung (){
        menuefuehrung = new MenueFuehrung();
        //hierdurch initialisieren wir den benutzer
        benutzer = menuefuehrung.regestriere();
        benutzer.anmeldung();
        //eine unendliche Schleife
        for (int i = 2; i>1; i++){
        menuefuehrung.zeigeMenue(benutzer);

        }
    }

}
