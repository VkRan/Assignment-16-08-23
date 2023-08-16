// 2) find all unique elements in a list

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class q2 {
    public static void countUnique(ArrayList<Integer> ls){
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (Integer i : ls) {
            Integer j = m.get(i);
            m.put(i, (j == null) ? 1 : j + 1);
        }
        System.out.println("Elements which are unique: ");
        for (Map.Entry<Integer, Integer> val : m.entrySet()) {
            if(val.getValue()==1)
                System.out.println(val.getKey());
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
        countUnique(ls);
    }
}