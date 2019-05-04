
package graficos;

import java.awt.Color;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Discos extends JPanel{
    public Discos() {
        Random rand = new Random();

        //Estos serán los que definirán los colores de losdiscos
        float fColor1 = rand.nextFloat();
        float fColor2 = rand.nextFloat();
        float fColor3 = rand.nextFloat();
        //Se establece con los múmeros anteriores el color de los discos
        Color colorAnillo = new Color(fColor1, fColor2, fColor3);
        //Línea 1
        Border bordejpanel = new TitledBorder(new BevelBorder(2));

        //Línea 2
        this.setBorder(bordejpanel); 
        this.setBackground(colorAnillo);
    }
}
