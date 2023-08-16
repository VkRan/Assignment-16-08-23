// 7) Top K Frequent Elements

import java.util.*;


public class q7 {
    public static void topKFreq(ArrayList<Integer> ls, int k){
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (Integer i : ls) {
            Integer j = m.get(i);
            m.put(i, (j == null) ? 1 : j + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer> >(m.entrySet());

        list.sort((i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        System.out.println("Top "+k+" frequent elements are: ");
        for(int i=list.size()-1;i>= list.size()-k;i--){
            System.out.println(list.get(i).getKey());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of k: ");
        int k=sc.nextInt();
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
        topKFreq(ls,k);
    }
}
