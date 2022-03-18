//Sinn der Klasse ist klar es muss nur geschaut werden wie wir das machen wird noch nicht gebraucht wirklich
public class Errungenschaft {
    private String name;
    private int jahr;
    private boolean jahrfestglegt = false;
    public Errungenschaft(String pname){
        name=pname;
    }
    public boolean getjahrfestgelegt(){
        return jahrfestglegt;
    }
    public void setname(String pname){
        name = pname;
    }
    public String getname(){
        return name;
    }
    public int getjahr(){
        return jahr;
    }
    public void setjahr(){
        System.out.println("Geben sie das Jahr der Errungenschaft ein");
        System.out.println("Wenn sie das nicht wissen geben sie bitte x ein");
        String yesONo = Read.string();
        if (yesONo.equals("x")){
            System.out.println("Sie haben kein Jahr angegeben");
        }else{
            jahr = Integer.valueOf(yesONo);
            jahrfestglegt = true;
        }
    }
}
