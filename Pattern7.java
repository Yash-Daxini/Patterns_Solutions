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
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int k = i; k > 0 ; k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= row-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
