public class Benutzer extends Person{
    private String passwort;
    public void änderePasswort(String pPasswort){
        passwort = pPasswort;
    }

    public Benutzer(String pVorname, String pNachname, int pAlter){
        super(pVorname, pNachname, pAlter);

    }
}
