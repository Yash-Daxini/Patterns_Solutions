/*
Input : 4
Output:
     1
    212
   32123
  4321234
   32123
    212
     1
*/
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int value;
        boolean isIncrement;
        for(int i=0; i < row ; i++){
            isIncrement = false;
            value = i+1;
            for(int k = 0 ; k <= row-i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*(i+1)-1 ; j++){
                System.out.print(value);
                if(value == 1){
                    isIncrement = true;
                }
                if(isIncrement){
                    value++;
                }
                else{
                    value--;
                }
            }
            System.out.println();
        }
        for(int i=row-2; i >= 0 ; i--){
            isIncrement = false;
            value = i+1;
            for(int k = 0 ; k <= row-i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*(i+1)-1 ; j++){
                System.out.print(value);
                if(value == 1){
                    isIncrement = true;
                }
                if(isIncrement){
                    value++;
                }
                else{
                    value--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
