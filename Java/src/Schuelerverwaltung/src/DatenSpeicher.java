import java.io.Serializable;

public class DatenSpeicher implements Serializable{
     Spiel[] spiel = new Spiel[10];

     String passwort;
     String benutzername;

    DatenSpeicher(){
        spiel[0] = new Spiel(null);
        spiel[1] = new Spiel(null);
        spiel[2] = new Spiel(null);
        spiel[3] = new Spiel(null);
        spiel[4] = new Spiel(null);
        spiel[5] = new Spiel(null);
        spiel[6] = new Spiel(null);
        spiel[7] = new Spiel(null);
        spiel[8] = new Spiel(null);
        spiel[9] = new Spiel(null);

    }
}

