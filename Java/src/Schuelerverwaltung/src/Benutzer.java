import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Benutzer extends Person {
    public String passwort;
    public String benutzername;
    DatenSpeicher datenSpeicher = new DatenSpeicher();
    //Ist dazu gut dass wir wissen ob er angemeldet sind
    public boolean angemeldet = false;
    public int counter= 0;
    public Fieldcommands fieldcommands = new Fieldcommands();
    public Spiel[] spiel = new Spiel[10];
    public boolean spielvorhanden;
    public int test;
    public int test2;
    // Wir erstellen die Spiele für Benutzer damit wir das dem Benutzer zu ordnen    


    
    public Benutzer(String pNutzername, int pAlter, String pPasswort){
        super(pAlter);
        passwort=pPasswort;
        benutzername=pNutzername;
    }
    public void initialisieren(){
    
    }
    public Benutzer erstelleNutzer(Benutzer pBenutzer){
        datenSpeicher.benutzername= pBenutzer.benutzername;
        datenSpeicher.passwort=pBenutzer.passwort;
        datenSpeicher.spiel=pBenutzer.spiel;

        return pBenutzer;
    }
    //getter und setter
    public void setangemeldet(boolean pangemeldet){
        angemeldet= pangemeldet;
    }
    public boolean getAngemeldet(){
        return angemeldet;
    }
    public void setbenutzername(){
        System.out.println("Bitte gib deinen Benutzernamen ein");
        benutzername = Read.string();
    }

    public void setpasswort(){
        //Beim setten vom Passwort wird eben verglichen ob beide Passwörter richtig ist
        System.out.println("Bitte gib dein Passwort ein");
        String pPasswort = Read.string();

        System.out.println("Bitte wiederhole das Passwort");
        String pPasswort2 = Read.string();
        int b=1;
       //Passwörter werden verglichen das darüber muss aber dennoch da sein damit der STrin erstellt wird
        while (b==1) {
            
            if (pPasswort2.equals(pPasswort)) {
                b--;
                passwort = pPasswort;
            } else {
                System.out.println("Du hast das falsche Passwort eingegeben, bitte versuche es erneut.");
                System.out.println("Gib das Passwort ein");
                pPasswort = Read.string();
    
                System.out.println("Gib das Passwort erneut ein");
                pPasswort2 = Read.string();
                b=1;
            }
        }
    }

    //Anmelde Funktion relativ simpel eigentlich genau so wie die while schleife in regestriere in menuefuehrung
    public boolean anmeldung(){
        Read.line();
    System.out.println("Melde dich bitte an");
        
        while (angemeldet ==false) {
            System.out.println("Bitte gib deinen Benutzernamen ein");
            String  pBenutzername = Read.string();
            System.out.println("Bitte gib dein Passwort ein");
            String pPasswort = Read.string();
            System.out.println("Anmeldedaten werden überprüft...");
            //wenn passwort und bejutzername richtig sind vergleich
            if (pPasswort.equals(passwort)) {
                if (pBenutzername.equals(benutzername)){
                    //beides richtig = true
                    angemeldet = true;
                    System.out.println("Anmeldedaten sind richtig, du bist jetzt angemeldet");
                } //wennn eines von beiden falsch ist dann passiert das
                else {
                    System.out.println("Anmeldedaten sind falsch, bitte versuche es erneut");
                  
                     angemeldet=false;
                 }
                } else {
               System.out.println("Anmeldedaten sind falsch, bitte versuche es erneut");
             
                angemeldet=false;
            }
        }
        return angemeldet;
    }
    //Wir legen auch ein Spiel in Benutzer an
    
    public Spiel spielanlegen(){
        
        
        System.out.println("Bitte gib den Namen des Spiels ein");
        String pName= Read.string();

        Spiel pSpiel = new Spiel(pName);
        counterRegulierung();
        return pSpiel;
    }
    
    private void counterRegulierung() {
        counter=0;
        for(int i=0; i>spiel.length; i++){
          
           if(spiel[i]!=null){
             counter++;
             
           }
        

       }
           
    }


    public void spielfestlegen(){
        counterRegulierung();
        if(spiel[counter]==null){ 
        spiel[counter] = spielanlegen();
        Read.line();
        spiel[counter].setkaufjahr();
        Read.line();
        spiel[counter].setspiezeit();
        spielvorhanden=true;
        counterRegulierung();
        }
        else{
            System.out.println("Alle Plätze sind belegt");
        }
        
    }
    public void spieleanzeigen(){
        
        System.out.println("Bitte wähle ein Spiel aus");
        for (int i = 0; i < spiel.length; i++){
            if(spiel[i]!=null)
            System.out.println(spiel[i].getname()+ " ("+i+")");
        }
    }
    public int menueanzeigen(){
        spieleanzeigen();

        System.out.println("Welches Spiel wählst du?");
        int gamenumber = Read.numberOSchleife();
      return gamenumber;
    }
    public int spielemenueanzeigen(int i){
        System.out.println("Wähle aus:");
        System.out.println("Errungenschaft anlegen (1)");
        System.out.println("Bewertung anlegen (2)");
        System.out.println("Abzeichenlevel festlegen (3)");
        System.out.println("Kaufjahr festlegen (4)");
        System.out.println("Spielzeit festlegen (5)");
        System.out.println("Spiellöschen (6)");
        System.out.println("Zurück (7)");
        System.out.println("Hauptmenü (8)");
        return Read.numberOSchleife();
    }
    public void spielemenue(){
        counterRegulierung();
        int b = 0;

        if(spielvorhanden==true){
            while(b==0){
                int a = 0;
                
            int spielnumber= menueanzeigen();
            if(spiel[spielnumber]!=null)
                while(a==0){
                System.out.println(spiel[spielnumber].getname());
                switch(spielemenueanzeigen(spielnumber)){
                    case 1: spiel[spielnumber].errungenschaftfestlegen();a=1;b=1; break;
                    case 2: spiel[spielnumber].bewertungscanner();a=1;b=1; break;
                    case 3: spiel[spielnumber].abzeichenscanner();a=1;b=1; break;
                    case 4: spiel[spielnumber].setkaufjahr();a=1;b=1;break;
                    case 5: spiel[spielnumber].setspiezeit(); a=1;b=1;break;
                    case 6: a=1; b=1; spieleLoeschenmenue(spielnumber); break;
                    case 7: a=1; break;
                    case 8: a=1; b=1; break;
                    default: System.out.println("Bitte wähle eine der oben stehende Optionen aus");
                }
            
            }
            else{
                if(spielnumber==counter){
                    b=1;
                }else{
                System.out.println("Bitte wiederhole deine Eingabe");
            }
                
            }   
            }
        }else {
            System.out.println("Lege zuerst ein Spiel an");
        }
    }
    public void spieleLoeschenmenue(int a){
        int i=0;
        while (i==0){
        System.out.println("Bist du dir sicher dass du das Spiel löschen willst?");
       switch(String.valueOf(Read.booleanx())){
           case "true": spieleloeschen(a);i =1;
           case "false": i=1;
            }
       }
        
    }
    public void spieleloeschen(int zahl){
        spiel[zahl]= null;
        while(zahl<counter){
            spiel[zahl]=spiel[zahl+1];
            zahl++;
        }
        spiel[counter]= null;
        counter--;
    }
    public void spieleUswAusgeben(){
        counterRegulierung();
        for (int i = 0; i < spiel.length; i++){
            if(spiel[i]==null){

            }else{ 
            Read.line();
            System.out.println(spiel[i].getname());
            if(spiel[i].getkaufjahrfestgelegt()==true){
            System.out.println("Kaufjahr:"+spiel[i].getkaufjahr());}
            if(spiel[i].getspielstundenfestgelegt()==true){
            System.out.println("Spielstunden:"+spiel[i].getspielzeit());}
            spiel[i].errungenschaftenausgeben();
            spiel[i].bewertungausgeben();
            spiel[i].abzeichenausgeben();
            }
        }
    }
    public void menue(){
        fieldcommands.menue();
    }

    public void saveSpiele() {

        for (int i = 0; i < 10; i++) {

            if (spiel[i] != null) {

                 

                datenSpeicher.spiel[i] = new Spiel("");

                datenSpeicher.spiel[i].name = spiel[i].name;

                datenSpeicher.spiel[i].spielstunden = spiel[i].spielstunden;

                datenSpeicher.spiel[i].counter = spiel[i].counter;

                for (int v = 0; v<10;v++){
                    if (spiel[i].errungenschaft[v] != null){
                        datenSpeicher.spiel[i].errungenschaft[v] = spiel[i].errungenschaft[v];
                    }
                }


                datenSpeicher.spiel[i].bewertung = spiel[i].bewertung;

                datenSpeicher.spiel[i].kaufjahr = spiel[i].kaufjahr;

                datenSpeicher.spiel[i].bewertet= spiel[i].bewertet;

                datenSpeicher.spiel[i].spielstundengelegt = spiel[i].spielstundengelegt;

                datenSpeicher.spiel[i].abzeichen = spiel[i].abzeichen;        
                

                datenSpeicher.spiel[i].kaufjahrvorhanden = spiel[i].kaufjahrvorhanden;  

                datenSpeicher.spiel[i].abzeichenbestimmt = spiel[i].abzeichenbestimmt;            

            
            }

        }

    }
    

    public void saveData() {

        try {
            FileOutputStream f = new FileOutputStream("ver.dat");

            BufferedOutputStream b = new BufferedOutputStream(f);

            ObjectOutputStream o = new ObjectOutputStream(b);

            datenSpeicher.benutzername = benutzername;

            datenSpeicher.passwort = passwort;

            saveSpiele();

            o.writeObject(datenSpeicher);

            o.close();


        } catch (IOException d) {

            d.printStackTrace();

        } 

    }

    public void loadData(){
        try {
         
            FileInputStream f2 = new FileInputStream("ver.dat");

            BufferedInputStream b2 = new BufferedInputStream(f2);

            ObjectInputStream obj2 = new ObjectInputStream(b2);

            DatenSpeicher datenSpeicher= (DatenSpeicher) obj2.readObject();

            benutzername = datenSpeicher.benutzername;
            passwort = datenSpeicher.passwort;

            System.out.println("Benutzer "+benutzername);
            
            for (int i = 0; i<10; i++){
                if(datenSpeicher.spiel[i]!=null)
                spiel[i] = new Spiel("");
                spiel[i] = datenSpeicher.spiel[i]; 
                counter=i;
                System.out.println("Spiel : "+spiel[i]);
                spielvorhanden=true;
            }

            
          

            obj2.close();

        } catch (IOException d) {

            d.printStackTrace();

        } catch (ClassNotFoundException d2) {

            d2.printStackTrace();

        }

    }
  
    }


