// 5) Longest Substring Without Repeating Characters

import java.lang.reflect.Array;
import java.util.*;

public class q5 {
    public static void longestSubstring(String str){
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        int l=str.length(), st=0,end=1, maxlen=-1;
        m.put(str.charAt(0), 1);
        for(int i=0;i<l;i++) {
            int f=0;
            int len=0;
//            if((l-i)<maxlen)
//                break;
            boolean[] vis = new boolean[256];
            for (int j = i; j < l; j++) {
                if (vis[str.charAt(j)]) {
                    if (len > maxlen) {
                        st = i;
                        end = j+1;
                        maxlen = len;
                    }
                    len=0;
                    f=1;
                    break;
                } else {
                    vis[str.charAt(j)] = true;
                    len++;
                }
            }
            vis[str.charAt(i)] = false;
            if (f==0 && len > maxlen) {
                st = i;
                end = l;
                maxlen = len;
            }
            System.out.print(maxlen+" ");
        }
        System.out.println(str.substring(st,end));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.next();
        longestSubstring(s);
    }
}
