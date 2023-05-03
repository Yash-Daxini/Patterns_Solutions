/*
Input : 4
Output:
        1      1
        12    21
        123  321
        12344321
*/
import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(j);
            }
            for(int j = i+1 ; j <= 2*row - i ; j++ ){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j-- ){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
