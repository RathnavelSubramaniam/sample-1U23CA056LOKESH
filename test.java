

import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner a1 = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = a1.nextLine();
    int age =a1.nextInt();
    int salary=a1.nextInt();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
