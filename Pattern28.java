/*
Input : 5
Output:
      *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
*/
import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for(int k = 0 ; k <= row - i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = row-2 ; i >= 0 ; i--){
            for(int k = 0 ; k <= row-i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
