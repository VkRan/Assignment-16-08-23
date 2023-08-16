// 6) group anagrams

import java.lang.reflect.Array;
import java.util.*;

public class q6 {
    public static void groupAnagrams(ArrayList<String> ls){
        Vector<Vector<String>> sol = new Vector<Vector<String>>();
        Map<String, Integer> m = new HashMap<String, Integer>();
        int l=ls.size();
        for(int i=0;i<l;i++) {
            String temp = ls.get(i);
            String str = temp;
            char[] ar = str.toCharArray();
            Arrays.sort(ar);
            str = String.valueOf(ar);
            if(m.containsKey(str)) {
                sol.get(m.get(str)-1).add(temp);
            } else {
                Vector<String> tem = new Vector<String>();
                tem.add(temp);
                sol.add(tem);
                m.put(str, sol.size());
            }
        }
        System.out.println(sol);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input total number of strings: ");
        int len=sc.nextInt();
        System.out.println("Enter array of strings: ");
        ArrayList<String> ls = new ArrayList<String>();
        int i=0;
        while (i<len) {
            String val = sc.next();
            ls.add(val);
            i++;
        }
        groupAnagrams(ls);
    }
}
