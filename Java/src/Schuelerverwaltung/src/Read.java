import java.util.Scanner;
public class Read {
private static Scanner sc = new Scanner(System.in);


    public static String string(){
        String a = sc.nextLine();
        if (a.equals("EXIT")){
            System.exit(1);
        }
        return a;
    }
  
    public static double dezi(){
        return Double.valueOf(string());
    }
    public static void line(){
        System.out.println("-----------");
    }
    public static void absatz(){
        System.out.println("");
    }
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
    public static int numberOSchleife(){
       
        int a = 100;
       
            try{
                a = Integer.parseInt(string()); 
            }catch(NumberFormatException ex){
            }
        return a;
    }
    public static boolean ueberpruefeDouble(String c){
        try{
            Double.parseDouble(c); 
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    public static boolean ueberpruefeNumber(String c){
       
        try{
            Integer.parseInt(c); 
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }

}
