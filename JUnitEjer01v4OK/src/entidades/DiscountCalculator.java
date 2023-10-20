

package entidades;

/**
 *
 * @author Pc
 */
public class DiscountCalculator {
    
    private double valor;
    private double descuento;
    private double active;

    public DiscountCalculator(double valor, double descuento) {
        this.valor = valor;
        this.descuento = descuento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
