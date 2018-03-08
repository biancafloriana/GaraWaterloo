
import java.util.*;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Gara waterloo = new Gara();
        Controller controler = new Controller(waterloo);
        waterloo.adaugaTren(new Tren("Bucuresti", "10:30", "123AB"));
        waterloo.adaugaTren(new Tren("Iasi", "22:10", "345ER"));
        waterloo.adaugaTren(new Tren("Bucuresti", "11:05", "784EQ"));
        waterloo.adaugaTren(new Tren("Sibiu", "19:12", "956CB"));
        waterloo.adaugaTren(new Tren("Sibiu", "14:10", "179DT"));
        waterloo.adaugaTren(new Tren("Timisoara", "23:45", "138AY"));

        System.out.println("Inainte de sortare--------------------");
        waterloo.getTrenuri().forEach( new Consumer<Tren>(){
            @Override
            public void accept(Tren s) {
                System.out.println(s.toString());
            }
        });

        Collections.sort(waterloo.getTrenuri());

        System.out.println("Dupa sortare--------------------");
        waterloo.getTrenuri().forEach( new Consumer<Tren>(){
            @Override
            public void accept(Tren s) {
                System.out.println(s.toString());
            }
        });
    }
}