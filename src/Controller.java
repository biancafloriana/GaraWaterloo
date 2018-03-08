import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Controller(Gara waterloo){
        Gui view = new Gui();
            view.addListenerButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = view.getCod();
                String infoTren = waterloo.findTren(cod);
                if(infoTren!= null) {
                    view.afisareTren(infoTren);
                } else {
                    view.afisareTren("Nu a fost gasit!");
                }
            }
        });
    }
}
