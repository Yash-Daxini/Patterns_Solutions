/*
Input : 5
Output:
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        *        *
        **      **
        ***    ***
        ****  ****
        **********
*/
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row ; i > 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= 2*(row-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= 2*(row-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
