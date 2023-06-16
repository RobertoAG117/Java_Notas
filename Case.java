import java.util.Scanner;
public class Case{
    public static void main(String[]args){
        int mes, a\u00f1o;
        String palabra_secreta="PILARES";
        Scanner sc = new Scanner(System.in);
   //     System.out.println("Estamos en el a\u00f1o "+a\u00f1o);
        System.out.print("Ingresa la palabra secreta para acceder: ");
        String palabra_usuario=sc.nextLine();
        if(palabra_usuario.equals(palabra_secreta)){
            System.out.println("Bienvenido al Case. Puedes entrar.");
            int numero_aleatorio=(int)(Math.random()*3+1);
            System.out.println(numero_aleatorio);
            switch(numero_aleatorio){
                case 1:
                    System.out.println("Este programa te dirá en número de días de un mes seleccionado.");
                    System.out.println("Ingresa el número del mes del año del 1 al 12.");
                    mes=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingresa el año: ");
                    a\u00f1o=sc.nextInt();
                    switch (mes) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        System.out.print("Este mes tiene 31 días.");
                        break;
                        case 4: case 6: case 9: case 11:
                        System.out.print("Este mes tiene 31 días.");
                        break;
                        case 2:
                        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                            System.out.println("El mes tiene 29 días.");
                        } else {
                            System.out.println("El mes tiene 28 días.");
                        }
                    }
                    default:
                            System.out.println("El mes introducido es incorrecto.");
                    break;
                        
                case 2: 
                    System.out.println("Programa que dice si el año es bisiesto.");
                    
                        break;
                case 3: 
                    System.out.println("Programa que te diga qué número pertenece al mes ingresado.");
                    break;
            }
        }else{
            System.out.println("Palabra incorrecta.");
        }
    }
}