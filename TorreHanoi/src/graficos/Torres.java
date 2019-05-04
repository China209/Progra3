
package graficos;

import java.awt.*;
import javax.swing.JPanel;

public class Torres extends JPanel{
    
    public Torres() {
        this.setLayout(null);
    }
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLACK);
        
        //Esta es la base de la torre que recibirá los discos
        g.fillRect(10, 270, 200,5);
        
        //El asta por el que pasarán los discos
        g.fillRect(110, 30, 5, 240);
        
    }
    
}
