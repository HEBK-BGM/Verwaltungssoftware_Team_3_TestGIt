import java.io.Serializable;

public class Abzeichen implements Serializable {
    private int level;
    public Abzeichen(int plevel){
        level=plevel;
    }
    public int getlevel(){
        return level;
    }
}