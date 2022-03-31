public class Fieldcommands {
    private Field[] field = new Field[20];
    private int counter = 0;
    private int siegeO;
    private int siegeX;
    private int siegeplayer;
    private int siegebot;
    private int unentschieden;
  

    public int menueanzeigen(){
        System.out.println("Wähle aus");
        System.out.println("Neues Spiel starten (1)");
        System.out.println("Bisherige spiele anzeigen (2)");
        System.out.println("zurück (3)");
        return Read.number();
    }
    public void menue(){
        int a= 0;
        while(a==0){
            switch (menueanzeigen()){
                case 1: gamestart(a); a=1; break;
                case 2: printAllFields(); a=1;break;
                case 3: a=1; break;
                default: System.out.println("Bitte Eingabe wiederholen");
            }
        }
    }
    public int spielergame(){
        System.out.println("Wähle aus:");
        System.out.println("2 Spieler (1)");
        System.out.println("1 Spieler (2)");
        System.out.println("zurück (3)");
        System.out.println("zurück zum Hauptmenue (4)");
        return Read.number();
    }
    public void gamestart(int b){
        int a =0;
        while(a==0){
            switch(spielergame()){
                case 1: normalgamestart(); a = 1; break;
                case 2: botgamestart(); a = 1; break;
                case 3: a=1; break;
                case 4: a= 1; b= 1; break;
                default: System.out.println("Bitte Eingabe wiederholen");
            }
        }
    }

//Bei false wird ein 2 Spieler Spiel gestartet
    public void normalgamestart(){
        field[counter]= new Field(false);
        setCheckGewinner();
        counter++;
    }
    public void botgamestart(){
        field[counter]= new Field(true);
        setCheckGewinner();
        counter++;
    }
    public void printAllFields(){
        for (int i = 0; i< counter; i++){
            field[i].printField();
            System.out.println(field[i].getGewinner());
            System.out.println("");
        }
        System.out.println("O hat insgesamt "+ siegeO +"-Mal gewonnen.");
        System.out.println("X hat insgesamt "+ siegeX +"-Mal gewonnen.");
        System.out.println("Der Bot hat insgesamt "+ siegebot +"-Mal gewonnen.");
        System.out.println("Der Spieler hat insgesamt "+ siegeplayer +"-Mal gewonnen.");
        System.out.println("Insgesamt gab es " + unentschieden +" Unentschieden");
    }
    public void setCheckGewinner(){
        if(field[counter].getGewinner().equals("Gewinner: O")){
            siegeO++;
        }
        if(field[counter].getGewinner().equals("Gewinner: Bot")){
            siegebot++;
        }
        if(field[counter].getGewinner().equals("Gewinner: X")){
            siegeX++;
        }if(field[counter].getGewinner().equals("Gewinner: Spieler")){
            siegeplayer++;
        }
        if(field[counter].getGewinner().equals("Unentschieden")){
            unentschieden++;
        }
    }
}
