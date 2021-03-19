package listas;

import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class Marco extends JFrame{
    public Marco(){
        //setBounds(int x-coordinate, int y-coordinate, int width, int height)
        setBounds(200,200,800,400);//definimos los px del marco
        Lamina myLamina = new Lamina();
        add(myLamina);
        setVisible(true);
    }
}
