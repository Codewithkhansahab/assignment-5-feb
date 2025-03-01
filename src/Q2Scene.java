//
//You are tasked with developing a simple inventory management system for a library that keeps track of book
// titles using a LinkedList. The program should allow the user to input a specified number of book titles and
// then display the list of books in the inventory.
//Input format :
//The first line of the input contains the number of books.
//The subsequent lines each contain the title of a book.
//Output format :
//Displays the final list of books
//Refer to the sample output
//Sample test cases :
//Input 1 :
//        2
//The Great Gatsby
//Moby Dick
//Output 1 :
//Books in the inventory:
//The Great Gatsby
//Moby Dick
//Input 2 :
//        5
//The Alchemist
//Sapiens: A Brief History of Humankind
//        Educated
//Becoming
//The Book Thief
//Output 2 :
//Books in the inventory:
//The Alchemist
//Sapiens: A Brief History of Humankind
//        Educated
//Becoming
//The Book Thief
//

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q2Scene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Inventory size");
        int size = Integer.parseInt(sc.nextLine());
        LinkedList<String> list = new LinkedList<String>();
        for (int i=0;i<size;i++){
            System.out.println("Enter Book Name Please");
            String bookName = sc.nextLine();
            list.add(bookName);
        }
        System.out.println("Books in the Inventory");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            String i = (String)itr.next();
            System.out.println(i);
        }




    }
}
//done
