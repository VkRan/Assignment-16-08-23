// 4) Any sorting algo using collections.

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

public class q4 {
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
        Collections.sort(ls);
        System.out.println("List after sorting: "+ls);
    }
}
