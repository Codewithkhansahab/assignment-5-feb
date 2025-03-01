import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name= name;
        this.id=id;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
 class Task2 {
     public static void main(String[] args) {
         List<Employee> list = new ArrayList<>();
         List<Employee> salaryList = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         int size = Integer.parseInt(sc.nextLine());
         for (int i = 0; i<size ;i++){
             String name  = sc.nextLine();
             int id = Integer.parseInt(sc.nextLine());
             int salary = Integer.parseInt(sc.nextLine());
             Employee e = new Employee(name, id ,salary);
             list.add(e);
         }
         for ( Employee er : list ){
             if (er.salary > 5000){
                 salaryList.add(er);
             }
         }
         System.out.println(salaryList);
     }
}
