import java.io.Serializable;

//Sinn der Klasse ist klar es muss nur geschaut werden wie wir das machen wird noch nicht gebraucht wirklich
public class Errungenschaft implements Serializable{
    private String name;
    private int jahr;
    private boolean jahrfestglegt = false;
    public Errungenschaft(String pname){
        name=pname;
    }
    public boolean getjahrfestgelegt(){
        return jahrfestglegt;
    }
    public String getname(){
        return name;
    }
    public int getjahr(){
        return jahr;
    }
    public void setjahr(){
        boolean x = false;
        while (x==false){
            String yesONo;
            System.out.println("Gib das Jahr der Errungenschaft ein, falls du es nicht weißt oder nicht eingeben möchtest gib x ein");
            yesONo = Read.string();
            if(yesONo.equals("x")){
                System.out.println("Es wurde kein Jahr gespeichert");
                x=true;
                jahrfestglegt=true;
            } else{
                if(Read.ueberpruefeNumber(yesONo)==true){
                    jahr = Integer.valueOf(yesONo);
                    jahrfestglegt = true;
                    x=true;
                }else{
                    System.out.println("Eingabe muss x oder eine Zahl sein");
                }
            }
        }
    }
}
