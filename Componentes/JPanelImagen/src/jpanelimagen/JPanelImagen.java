package jpanelimagen;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class JPanelImagen extends JPanel implements Serializable {

    private imagenFondo imagenFondo;

    public JPanelImagen() {

    }

    public imagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(imagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo.getRutaImagen() != null && imagenFondo.getRutaImagen().exists()) {
            ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }

}
