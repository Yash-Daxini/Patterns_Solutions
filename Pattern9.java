/*
Input : 5
Output:
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row-1 ; i >= 0 ; i--){
            for(int k = row-i-1; k > 0 ; k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*(i+1)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
