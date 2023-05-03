/*
Input : 5
Output:
        EDCBA
        DCBA
        CBA
        BA
        A
*/
import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int val = 64;
        for(int i = row ; i >= 1 ; i--){
            for(int j = i ; j > 0 ; j-- ){
                System.out.print((char)(val + j));
            }
            System.out.println();
        }
        sc.close();
    }
}
