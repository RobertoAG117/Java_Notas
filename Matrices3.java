import java.util.Scanner;
public class Matrices3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n, cn;
        System.out.print("Ingresa en tamaño de la matriz");
        n = sc.nextInt();

        int[][] mat = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
            mat[i][j] =(int)(Math.random()*(2));
        }
        if(n%2 == 0){
            cn = (int)( (n/2)-1);}
        else{
            cn =(int)( (n/2));}
        for (int i = 0; 1 < n; i++){
            System.out.print(mat[i][cn] +" "+ mat[i][cn+1] + "\n");
        }
    }
}