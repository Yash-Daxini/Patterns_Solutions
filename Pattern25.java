/*
Input : 5
Output:
     *****
    *   *
   *   *
  *   *
 *****
*/
import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int k = 0 ; k < row - i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < row ; j++ ){
                if( i == 0 || j == 0 || i == row-1 || j == row-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
