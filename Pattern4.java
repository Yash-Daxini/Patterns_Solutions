/*
Input : 5
Output:
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
