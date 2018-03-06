import java.util.*;

public class Gara {
    private List<Tren> trenuri;

    public Gara(){
        trenuri = new ArrayList<Tren>();
    }


    public void adaugaTren(Tren t){
        trenuri.add(t);
    }

    public List getTrenuri() {
        return trenuri;
    }

    public String findTren(String cod) {
        Iterator<Tren> iterator = trenuri.iterator();
        while ( iterator.hasNext()){
            Tren t = iterator.next();
            if(t.getCod().equals(cod)){
                return t.toString();
            }
        }
        return null;
    }
}
