import java.util.*;
public class serie {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int elec= 0;
        int impar=1;

        System.out.println(" Bienvenido ");
        System.out.println("¿Que sererie quieres mostrar: ");
        System.out.println("Serie de impares= 1 o Serie Fibonacci= 2 ");
        System.out.println(" ");

        elec = entrada.nextInt();
        entrada.nextLine();

        if(elec == 1){
            for(int i=1; i <= 15; i++){
            System.out.println(impar + " ");
            impar += 2;
            }
        }else{
            int serie = 15, num1 = 0, num2 = 1, suma = 0;
        
            System.out.println(num1);

        for (int j = 1; j < serie; j++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        }
    }
}
