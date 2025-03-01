import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Task1 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<String> dost = new ArrayList<String>();
         int size = Integer.parseInt(sc.nextLine());
         for (int i =0; i < size; i++){
             String name = sc.nextLine();
             dost.add(name);
         }
         System.out.println(dost);
         List<String> upperDost = dost.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
         System.out.println(upperDost);
     }
}
