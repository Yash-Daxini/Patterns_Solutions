/*
Input : 5
Output:
            1
          1   1
        1   2   1
      1   3   3   1
    1   4   6   4   1
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<row;i++){
            l.add(new ArrayList<>());
        }
        if(row >= 1){
            l.get(0).add(1);
        }
        if(row >= 2){
            l.get(1).add(1);
            l.get(1).add(1);
        }
        for(int i = 2 ; i < row ; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0 ; j < l.get(i-1).size()-1;j++){
                temp.add(l.get(i-1).get(j) + l.get(i-1).get(j+1));
            }
            temp.add(1);
            l.set(i,new ArrayList<>(temp));
            temp.clear();
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 2*row-2*i ; j >= 0 ; j-- ){
                System.out.print(" ");
            }
            for(int k = 0 ; k < l.get(i).size() ; k++){
                System.out.print(" ");
                System.out.print(l.get(i).get(k)+" ");
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
