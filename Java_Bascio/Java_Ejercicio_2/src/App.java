import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuál es el precio?");
        double precioSinIVA = leer.nextDouble();

        double precioImpuesto = precioSinIVA * .16;
        
        double precioTotal = precioSinIVA + precioImpuesto;

        System.out.println("El precio con IVA sería de: $" + precioTotal);

    }

}
