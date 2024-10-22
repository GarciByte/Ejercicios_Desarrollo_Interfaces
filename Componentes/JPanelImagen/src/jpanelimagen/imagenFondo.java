package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author David
 */
public class imagenFondo implements Serializable {

    private File rutaImagen;
    private Float opacidad;

    public imagenFondo(File rutaImagen, Float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public Float getOpacidad() {
        return opacidad;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public void setOpacidad(Float opacidad) {
        this.opacidad = opacidad;
    }
}
