import java.util.Scanner;
public class Ejercicios_sencillos_2 {
      public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Hola usuario nuevo, Digame su nombre: ");
        String nombre = dato.nextLine();
        System.out.println("Hola " + nombre + ", Ingrese su primer numero donde va a iniciar: ");
        int n1 = dato.nextInt();
        System.out.println("Hola " + nombre + ", Ingrese su segundo numero donde va a ser el rango: ");
        int n2 = dato.nextInt();
        if (n1 > n2) {
            System.out.println("¡" + nombre + ", El primer numero es mayor que tu segundo numero!, vuelva a elegir otros numeros");
        }
        while (n1 <= n2) {
            if (n1 % 2 == 0) {
                ;

                n1 = n1 + 1;

            } else if(n1 % 2 !=0) {
                System.out.println("Numero impar: " + n1);
                n1 = n1+ 2;

            }
        }
    }
}
