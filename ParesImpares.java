import java.util.Scanner;
    public class ParesImpares{
        public static void main(String[] args) {
            int Numero;
            System.out.println("Ingresa una variable de tipo numero:");
            Scanner sc = new Scanner(System.in);
            Numero=sc.nextInt();
            sc.nextLine();

            for(int i=1; i<=10; i++){
                if(i==Numero){
                    System.out.println(Numero + " Es tu numero");
                    continue;
                } if (i>=7){
                    break;
                }
            
                if (i%2==0){
                    System.out.println(i + " Es par");
                } else {
                    System.out.println(i + " Es Impar");
                }
            }
            // }
            // System.out.println("ingresa un nomnre");
            // String nombre = sc.nextLine();
            // System.out.println("Ingrese edad");
            // int edad = sc.nextInt();
            // sc.nextLine();
            // System.out.println("ingresa apellido");
            // String apellido=sc.nextLine();

            // while (nombre.equals("juan")){
            //     System.out.println(nombre);
            //     System.out.println(edad);
            //     System.out.println(apellido);
            //     System.out.println("ingresa otro nombre");
            //     nombre=sc.nextLine();

            // }
        }
    }

