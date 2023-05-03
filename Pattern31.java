/*
Input : 4
Output:
        4444444
        4333334
        4322234
        4321234
        4322234
        4333334
        4444444
*/
import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            for( int k = 0 ; k < i ; k++ ){
                System.out.print(row - k);
            }
            int val = row - i;
            for(int j = i ; j < 2*row - 1 - i - 1 ; j++ ){
                System.out.print(val);
            }
            for( int k = i ; k >= 0 ; k-- ){
                System.out.print(row - k);
            }
            System.out.println();
        }
        for(int i = 2*row - row - 2 ; i >= 0 ; i--){
            for( int k = 0 ; k < i ; k++ ){
                System.out.print(row - k);
            }
            int val = row-i;
            for(int j = i ; j < 2*row-2-i ; j++ ){
                System.out.print(val);
            }
            for( int k = i ; k >= 0 ; k-- ){
                System.out.print(row - k);
            }
            System.out.println();
        }
        sc.close();
    }
}
