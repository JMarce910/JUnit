

package ejemplotestjunit.servicios;

import ejemplotestjunit.entidades.Rectangulo;

/**
 *
 * @author Pc
 */
public class RectanguloServicio {
    
    //13. creo el metodo calcularArea
    public double calcularArea(Rectangulo r){ 
        return r.getAncho() * r.getLargo();
    }
    
    //15. creo el metodo calcularPerimetro
    public double calcularPerimetro(Rectangulo r){
        return 2*(r.getAncho()) + 2*(r.getLargo());
    }
    
}
