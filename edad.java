import java.util.Scanner;
public class edad{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= scanner.nextInt();
        int resta= 2023-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        boolean mayor= resta>=18;
        System.out.println("Si es mayor imprime true si es menor imprime false"+" "+mayor);
    }
}
