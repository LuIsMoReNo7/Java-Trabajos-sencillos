import java.util.Scanner;
public class Diferente_menor_igual {
    public static void main(String[] args) {
        //ingrsamos el primer dato
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = dato.nextInt(); 
        //ingresamos el segundo dato
        System.out.println("Ingrese el segundo numero: ");
        int n2 = dato.nextInt();
        //llamamos a if para ver si es diferente
        if (n1!=n2) { 
        System.out.println(n1 + " es diferente que " + n2);
        } 
        //llamamos a if para ve si es menor
        if (n1<n2) {
        System.out.println(n1 + " es menor que " + n2);
        }   
        //llamamos a if para ver si es menor o igual
        if (n1<=n2) {
        System.out.println(n1 + " es menor o igual que " + n2);
        } 
       
    } 
}

