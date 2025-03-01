import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Task23 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(9);
        list.add(34);
        list.add(6);
        list.add(5);
        list.add(11);
        for (Integer l : list){
            if (l % 2 ==0){
                even.add(l);
            }

        }
         System.out.println(even);
    }
}
