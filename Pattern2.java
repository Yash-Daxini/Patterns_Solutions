/*
Input : 5
Output:
        *
        **
        ***
        ****
        *****
*/
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
