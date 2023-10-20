
package entidades;


public class DiscountCalculator {
    
    public double calculateDiscount(double originalPrice, double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }

        // Calcula el monto de descuento con base en el porcentaje proporcionado
        double discountAmount = originalPrice * (discountPercentage / 100.0);
        
        // Calcula el precio con descuento restando el monto de descuento al precio original
        return originalPrice - discountAmount;
    }

}
