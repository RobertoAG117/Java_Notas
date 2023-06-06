import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento ");
        int añodenacimiento= sc1.nextInt();
        int resta= año-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        if(resta>=18){
            System.out.println("es mayor de edad")
            else{
                System.out.println("es menor de edad")
            }
        }
    }
}

//int anio_Actual = java.time.Year.now().getvalue();
/*if(edad>=18){
    System.out.println("es mayor de edad")
    else{
        System.out.println("es menor")
    }
} */