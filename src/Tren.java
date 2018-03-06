import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tren implements Comparable{

    private String destinatie;
    //private String oraPlecare;
    private LocalTime oraPlecare;
    private String cod;



    public Tren(String destinatie, String oraPlecare, String cod) {
        this.destinatie = destinatie;
        this.oraPlecare = this.oraPlecare.parse(oraPlecare, DateTimeFormatter.ISO_LOCAL_TIME);
        this.cod = cod;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public String getOraPlecare() {
        return oraPlecare.toString();
    }

    public void setOraPlecare(String oraPlecare) {
        this.oraPlecare = this.oraPlecare.parse(oraPlecare, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public int compareTo(Object o) {
       return  oraPlecare.compareTo(LocalTime.parse(((Tren)o).getOraPlecare()));
    }

    public String toString(){
        return "Cod: " + cod + " Destinatie: " + destinatie + " Ora plecare: " + oraPlecare.toString();
    }
}
