/*
Input : 4
Output:
        a
        Bc
        DeF
        gHiJ
        kLmNo
*/
import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        boolean isCap = false;
        int val = 97;
        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                if(isCap){
                    isCap = false;
                    System.out.print((char)(val - 32));
                }
                else{
                    isCap = true;
                    System.out.print((char)(val));
                }
                val++;
            }
            System.out.println();
        }
        sc.close();
    }
}
