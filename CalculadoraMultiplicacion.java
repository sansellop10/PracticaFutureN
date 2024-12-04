import java.util.Scanner;
public class CalculadoraResta{
    public static void main(String[] args) {
        int num1, num2;
        float multiplicacion;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce numero 1: ");
            num1= in.nextInt();

        System.out.print("Introduce numero 2: ");
            num2 = in.nextInt();

        multiplicacion = num1 * num2;

        System.out.println("El resultadoe es: "+multiplicacion);

        in.close();

    }
}