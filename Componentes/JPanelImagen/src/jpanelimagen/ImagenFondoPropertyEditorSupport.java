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
        return super.getJavaInitializationString();
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue();
    }

    

}
