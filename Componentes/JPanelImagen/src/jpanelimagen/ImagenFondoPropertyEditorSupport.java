package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author David
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport {

    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel;
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo = imagenFondoPanel.getSelectedValue();
        String ruta = imagenFondo.getRutaImagen().getAbsolutePath();
        ruta = ruta.replace('\\', '/');
        return "new jpanelimagen.ImagenFondo(" + "new java.io.File(\"" + ruta + "\")," + imagenFondo.getOpacidad() + "f)";
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }

}
