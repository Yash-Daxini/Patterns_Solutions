/*
Input : 5
Output:
        *****
        ****
        ***
        **
        *
*/
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int j = row-i-1 ; j >= 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
