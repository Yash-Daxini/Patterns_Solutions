/*
Input : 5
Output:
 1 2 3 4  17 18 19 20 
  5 6 7  14 15 16    
    8 9  12 13       
      10  11
*/
import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int totalInOnePart = 0;
        for(int i = row ; i > 0 ; i--) totalInOnePart += i;
        int y = 1;
        int total = totalInOnePart * 2 + 1 ;
        for(int i = row ;i >= 1 ; i--){
            total = total - i;
            int x = total;
            for(int k = 1 ; k <= row-i ; k++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if( j == 1 && i < row ){
                    for(int h = 1 ; h <= row-i; h++ ){
                        System.out.print(" ");
                    }
                }
                System.out.print(y++ + " ");
            }
            System.out.print(" ");
            for(int j = 1 ; j <= i ; j++){
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
