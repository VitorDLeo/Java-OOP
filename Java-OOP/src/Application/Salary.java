package Application;

import entities.Employ;

import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employ employ = new Employ();

        System.out.print("Name: ");
        employ.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        employ.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employ.tax = sc.nextDouble();

        System.out.println(employ);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employ.IncreaseSalary(percentage);

        System.out.println("Update data: " + employ);

        sc.close();
    }
}
