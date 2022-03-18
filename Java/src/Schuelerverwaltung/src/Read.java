import java.util.Scanner;
public class Read {
private static Scanner sc = new Scanner(System.in);


    public static String string(){
        return sc.nextLine();
    }
    public static int number(){
        return Integer.valueOf(sc.nextLine());
    }
    public static double dezi(){
        return Double.valueOf(sc.nextLine());
    }
    public static void line(){
        System.out.println("-----------");
    }
}
