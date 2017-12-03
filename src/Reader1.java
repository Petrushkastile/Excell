
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class Reader1 {

    private String izmena;
    private int nomerStroki;


    private String izmenennaya;
    private String name;
    private String surname;
    private String age;
    private String oldName;
    private String oldSurname;
    private String oldAge;

    public String getOldName() throws IOException {
        oldName=getDannie()[0];
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getOldSurname() throws IOException {
        oldSurname=getDannie()[1];
        return oldSurname;
    }

    public void setOldSurname(String oldSurname) {
        this.oldSurname = oldSurname;
    }

    public String getOldAge() throws IOException {
        oldAge=getDannie()[2];
        return oldAge;
    }

    public void setOldAge(String oldAge) {
        this.oldAge = oldAge;
    }

    public String[] getNewDannie() {
        String[] newDannie=new String[3];
        newDannie[0]=name;
        newDannie[1]=surname;
        newDannie[2]=age;
        return newDannie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getDannie() throws IOException {
        String[]dannie;
        dannie = getIzmena().split( "[,;:.!?\\s]+" );
        return dannie;
    }



    public String getIzmenennaya() throws IOException {

        izmenennaya = getNewDannie()[0]+",        "+ getNewDannie()[1]+",        " + getNewDannie()[2];
        return izmenennaya;
    }

    public void setIzmenennaya(String izmenennaya) {
        this.izmenennaya = izmenennaya;
    }

    public ArrayList<String> getTablica() throws IOException {
        ArrayList<String> tablica = new ArrayList<>();
        LineNumberReader reader = new LineNumberReader( new FileReader( "F:/untitled/src/tablica.csv" ) );
        String line = null;
        while ((line = reader.readLine()) != null) {
            tablica.add( line );
        }
        return tablica;
    }

    public String getIzmena() throws IOException {
        izmena = getTablica().get( getNomerStroki() );
        return izmena;
    }

    public void setIzmena(String izmena) {
        this.izmena = izmena;
    }

    public int getNomerStroki() {
        return nomerStroki;
    }

    public void setNomerStroki(int nomerStroki) {
        this.nomerStroki = nomerStroki;
    }

    public void getekran() throws IOException {
        for (int i = 0; i < getTablica().size(); i++) {
            System.out.println( getTablica().get( i ) );
        }
    }

    public ArrayList<String> izmeniy ( ) throws IOException {

        ArrayList<String> tablicaizm=getTablica();
        tablicaizm.set( nomerStroki,izmenennaya  );
        return tablicaizm;
        
    }

    public void getekranNew() throws IOException {
        for (int i = 0; i < izmeniy().size(); i++) {
            System.out.println( izmeniy().get( i ) );
        }
    }

}
