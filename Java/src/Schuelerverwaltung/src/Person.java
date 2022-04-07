import java.io.Serializable;

//Ist einfach dazu gut dass wir iene Superklasse von Benutzer haben könnte man genau so in Benutzer machen aber wir wollen flexen
public class Person implements Serializable{
    private int alter;
    //getter und setter
    public Person (int pAlter){
        alter = pAlter; 
    }

    public void setAlter(int pAlter){
        alter = pAlter;
    }

    public int getAlter(){
        return alter;
    }

}
