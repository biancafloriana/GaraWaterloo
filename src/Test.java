import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Gara Waterloo = new Gara();
        Gui view = new Gui();
        view.addListenerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = view.getCod();
                String infoTren = Waterloo.findTren(cod);
                if(infoTren!= null) {
                    view.afisareTren(infoTren);
                } else {
                    view.afisareTren("Nu a fost gasit!");
                }
            }
        });
        Waterloo.adaugaTren(new Tren("Bucuresti", "10:30", "123AB"));
        Waterloo.adaugaTren(new Tren("Iasi", "22:10", "345ER"));
        Waterloo.adaugaTren(new Tren("Bucuresti", "11:05", "784EQ"));
        Waterloo.adaugaTren(new Tren("Sibiu", "19:12", "956CB"));
        Waterloo.adaugaTren(new Tren("Sibiu", "14:10", "179DT"));
        Waterloo.adaugaTren(new Tren("Timisoara", "23:45", "138AY"));

        System.out.println("Inainte de sortare--------------------");
        Waterloo.getTrenuri().forEach( new Consumer<Tren>(){
            @Override
            public void accept(Tren s) {
                System.out.println(s.toString());
            }
        });

        Collections.sort(Waterloo.getTrenuri());

        System.out.println("Dupa sortare--------------------");
        Waterloo.getTrenuri().forEach( new Consumer<Tren>(){
            @Override
            public void accept(Tren s) {
                System.out.println(s.toString());
            }
        });
    }
}