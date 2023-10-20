
package servicios;

import entidades.DiscountCalculator;


public class DiscountServices {

    public double calcularDiscount(DiscountCalculator r) {
        double descuento = r.getDescuento() / 100;
        if (r.getDescuento() == 100) {
            return 0.0;
        } else if (r.getDescuento() == 0) {
            return r.getValor();
        }
        return r.getValor() * descuento;
    }

}
