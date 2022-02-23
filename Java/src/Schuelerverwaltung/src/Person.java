public class Person {
    private String vorname;
    private String nachname;
    private int alter;
    public Person (String pVorname, String pNachname, int pAlter){
        vorname = pVorname;
        nachname = pNachname;
        alter = pAlter; 
    }
    public void setVorname(String pName) {
        vorname = pName;
    }
    public void setNachname(String pName) {
        nachname = pName;
    }
    public void setAlter(int pAlter){
        alter = pAlter;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getAlter(){
        return alter;
    }

}
