/*
Input : 5
Output:
    E
    DE
    CDE
    BCDE
    ABCDE
*/
import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int val = 64;
        for(int i = row ; i >= 1 ; i--){
            for(int j = row - i ; j >= 0 ; j-- ){
                System.out.print((char)(val + row-j));
            }
            System.out.println();
        }
        sc.close();
    }
}
