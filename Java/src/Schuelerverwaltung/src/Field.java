public class Field{
    private String[] field = new String[10];
    private String x = "X";
    private String o = "O";
    private int playernumber = 1;
    private boolean beendet= false;
    private String gewinner;
    private int zugAnzahl;
    private boolean botgame;
    public Field(boolean botgame){
        this.botgame=botgame;
        fieldDecleration();
        while(beendet==false){
            if (botgame==false){
            setField();
            }
            if (botgame==true){
                setFieldBot();
            }
            chechWin();
            chechUnentscheiden();
        }
    }
    public void setGewinner(String pGewinner){
        gewinner = pGewinner;
    }
    public String getGewinner(){
        return gewinner;
    }
    public Boolean getBotGame(){
        return botgame;
    }
    public void fieldDecleration(){
        for(int i = 1; i <10; i++){
            field[i]= String.valueOf(i);
        } 
    }
    public void printField(){
        System.out.println("|"+field[1]+"|"+field[2]+"|"+field[3]+"|");
        System.out.println("|"+field[4]+"|"+field[5]+"|"+field[6]+"|");
        System.out.println("|"+field[7]+"|"+field[8]+"|"+field[9]+"|");
    }
    public int chooseField(){
        System.out.println("Wähle aus");
        printField();
        int a = Read.number();
        while(field[a]==x|field[a]==o){
            System.out.println("Wiederhole deine Eingabe");
            printField();
            a = Read.number();
        }
        return a;

    }
    public void setField(){
        int a =chooseField();
        if (playernumber==1){
            field[a]=x;
            playernumber = 2;
        }else{
            field[a]=o;
            playernumber = 1;
        }
    }

    public void setFieldBot(){
        if (playernumber==1){

            field[chooseField()]=x;
            playernumber = 2;
        }else{
            System.out.println("Der Bot hat Feld"+botrandom() + "gewählt");
            printField();
            playernumber = 1;
        }
    }
    public int botrandom(){
        boolean correctfield = false;
        int feld= 10;
        while (correctfield ==false){
        feld = Read.random(1, 9);
        if(field[feld].equals(String.valueOf(feld))){
        correctfield = true;
        field[feld]=o;
        } 
    }
        return feld;
    }
    public void chechUnentscheiden(){
        zugAnzahl++;
        if (zugAnzahl==9){
            beendet=true;
            gewinner="Unentschieden";
        }
    }
    public void chechWin(){
        checkWinner(1, 2 ,3);
        checkWinner(7, 8 ,9);
        checkWinner(4,6,5);
        checkWinner(1,4,7);
        checkWinner(2,5,8);
        checkWinner(3,6,9);
        checkWinner(1,5,9);
        checkWinner(3, 5, 7);      
    }



    public void checkWinner(int i, int o, int p){
        if(field[i].equals(field[o])&field[p].equals(field[i])){
            testField(i);
        }
    }
    public void testField(int a){
        if (field[a].equals(o)){
            if (botgame==true){
    	    System.out.println("Der Bot hat gewonnen.");
            beendet = true;
            setGewinner("Gewinner: Bot");

            }else{

            System.out.println("Spieler O hat gewonnen");
            beendet = true;
            setGewinner("Gewinner: O");

            }

        }
        if (field[a].equals(x)){
            if (botgame=true){
                System.out.println("Der Spieler hat gewonnen.");
                beendet = true;
                setGewinner("Gewinner: Spieler");
     
            }else{
                System.out.println("Spieler X hat gewonne");
                beendet = true;
                setGewinner("Gewinner: X");
            }
        }

    }
}