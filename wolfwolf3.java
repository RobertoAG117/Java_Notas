import java.util.*;
public class wolfwolf{
    public static void main (String[]args){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Ingres el año de nacimiento entre 1923 y 2013: ");
        int añodenacimiento= sc1.nextInt();
        if(añodenacimiento<=1923 || añodenacimiento >=2013){
            System.out.println("ingresaste mal el año de nacimiento"+" "+añodenacimiento);
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Ingres el año de nacimiento entre 1923 y 2013: ");
            int añodenacimiento2= sc2.nextInt();
            int resta= año-añodenacimiento2;
            System.out.println("Su edad es"+" "+resta);
            if(resta>=10 && resta <=15){
                System.out.println("es niño");
            }else if(resta>=16 && resta <=17){
                System.out.println("es adolescente");
            }else if(resta>=18 && resta <=25){
                System.out.println("es joven");
            }else if(resta>=26 && resta <=35){
                System.out.println("es joven adulto");
            }else if(resta>=36 && resta <=60){
                System.out.println("es adulto");
            }else if(resta>=60 && resta <=200){
                System.out.println("es tercera edad");
        }
        }else{
            int resta= año-añodenacimiento;
        System.out.println("Su edad es"+" "+resta);
        if(resta>=10 && resta <=15){
            System.out.println("es niño");
        }else if(resta>=16 && resta <=17){
            System.out.println("es adolescente");
        }else if(resta>=18 && resta <=25){
            System.out.println("es joven");
        }else if(resta>=26 && resta <=35){
            System.out.println("es joven adulto");
        }else if(resta>=36 && resta <=60){
            System.out.println("es adulto");
        }else if(resta>=60 && resta <=200){
            System.out.println("es tercera edad");
        }
        }
    }
}
