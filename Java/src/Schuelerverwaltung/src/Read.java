import java.util.Scanner;
import java.util.Random;
public class Read {
private static Scanner sc = new Scanner(System.in);
private static Random r = new Random();

//Der Scanner scannt in string() ebenfalls ob EXIT eingegeben wurde string() wird bei ausnahmslos jeder einnahme verwendet die anderen Methoden verwenden string() und erweitern ihn
    public static String string(){
        String a = sc.nextLine();
        if (a.equals("EXIT")){
            exit();
        }
        return a;
    }
    public static boolean booleanx(){
        boolean a= false;
        int c = 0;
        while(c==0){
            switch(string()){
                case "Ja": a = true; c= 1;break;
                case "Nein": a = false; c=1;break;
                default: System.out.println("Bitte Eingaben wiederholen");
            }
        }
        return a;

    }

    public static int number(){
       
        int a = 100;
        while (a<1|a>9){
            try{
                a = Integer.parseInt(string()); 
            }catch(NumberFormatException ex){
                System.out.println("Eingabe muss zwischen 1 und neun liegen verusche es erneut");
            }
            if (a<1|a>9){
                System.out.println("Eingabe muss zwischen 1 und neun liegen verusche es erneut");
            }
        }
        return a;
    }

    public static void line(){
        System.out.println("-----------");
    }
    public static void absatz(){
        System.out.println("");
    }
    // So lange die eingabe kein Integer ist wird das hier wiederholt und die Fehlermeldung s angezeigt
    public static int noString(String s){
        int b=1;
        int a = 0;
        while (b==1){
            try{
                a = Integer.parseInt(string()); 
                b--;
            }catch(NumberFormatException ex){
                System.out.println(s);
            }
        }
        return a;
    }
    // DAs geliche wie noString() nur ohne Fehlermeldung und ohne schleife
    public static int numberOSchleife(){
       
        int a = 100;
       
            try{
                a = Integer.parseInt(string()); 
            }catch(NumberFormatException ex){
            }
        return a;
    }
//ueberprueft einen Wert ob er in einen double umgewertet werden kann und returnt false oder true
    public static boolean ueberpruefeDouble(String c){
        try{
            Double.parseDouble(c); 
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    //ueberprueft ob ein Wert in einen Integer ugewandelt werden kann und return true oder false
    public static boolean ueberpruefeNumber(String c){
       
        try{
            Integer.parseInt(c); 
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    public static void exit(){
        System.out.println("Credits:");
        System.out.println("Gruppenleiter: Attakan Karaustaoglu");
        System.out.println("Wehr oder weniger Co-Gruppenleiter/Programmier Dierektor: Jost Trappmann");
        System.out.println("Quellcode: Jost Trappmann");
        System.out.println("Pflichtenheft: Attakan Karaustaoglu, Jost Trappmann, Marvin Ruwe, Max Sautmann");
        System.out.println("Datenspeicherung: Attakan Karaustaoglu");
        System.out.println("Minispiel Tic Tac Toe");
        System.exit(1);
    }
    public static int random(int min, int max ){
        return r.nextInt(max-min+1)+ min;
    }
}
