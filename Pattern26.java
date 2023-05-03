/*
Input : 6
Output:
        111111
        22222
        3333
        444
        55
        6
*/
import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row - 1 ; i >= 0 ; i--){
            for(int j = 0 ; j <= i ; j++ ){
                System.out.print(row - i);
            }
            System.out.println();
        }
        sc.close();
    }
}
