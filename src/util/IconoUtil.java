package util;

import java.awt.Image;
import java.awt.Toolkit;

public class IconoUtil {
    public static Image obtenerIcono() {
        return Toolkit.getDefaultToolkit().getImage(
            IconoUtil.class.getResource("/Imagenes/logo.png")
        );
    }
}