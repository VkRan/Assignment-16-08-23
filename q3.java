// 3) find all next greater element of all no in a list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q3 {
    public static void greaterElement(ArrayList<Integer> ls){
        int len=ls.size();
        System.out.println("Next greater element of all elements are: ");
        for(int i=0;i<len;i++){
            int f=0;
            for(int j=i+1;j<len;j++){
                if(ls.get(i)<ls.get(j)){
                    System.out.print(ls.get(j)+" ");
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.print(-1+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input total number of integers: ");
        int len=sc.nextInt();
        System.out.println("Enter the numbers: ");
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int i=0;
        while (i<len) {
            int val = sc.nextInt();
            ls.add(val);
            i++;
        }
        greaterElement(ls);
    }
}