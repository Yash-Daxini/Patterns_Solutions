/*
Input : 5
Output:
     1
    212
   32123
  4321234
 543212345
*/
import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i < row ; i++){
            int value = i+1;
            boolean isInc = false;
            for(int k = 1 ; k <= row - i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i+1 ; j++ ){
                System.out.print(value);
                if(value == 1){
                    isInc = true;
                }
                if(isInc){
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
