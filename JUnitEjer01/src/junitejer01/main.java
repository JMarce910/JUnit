
package junitejer01;

import entidades.DiscountCalculator;

/**
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
**/
public class main {

   
    
    public static void main(String[] args) {
        
        double originalPrice = 100.0;
        double discountPercentage = 10.0;

        DiscountCalculator dc = new DiscountCalculator();
        double discountedPrice = dc.calculateDiscount(originalPrice, discountPercentage);

        System.out.println("Precio original: $" + originalPrice);
        System.out.println("Porcentaje de descuento: " + discountPercentage + "%");
        System.out.println("Precio con descuento: $" + discountedPrice);
    }
    
}
