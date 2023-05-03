/*
Input : 5
Output:
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
*/
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int value = 1;
        for(int i = 0 ; i < row ; i++){
            if( (i & 1) == 0 ) value = 1;
            else value = 0;
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print((value++ % 2) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
