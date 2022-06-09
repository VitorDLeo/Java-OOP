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
        employ.grossSalary = sc.nextFloat();

        System.out.print("Tax: ");
        employ.tax = sc.nextFloat();

        System.out.println(employ.toStringEmploy());

        System.out.println();

        sc.close();
    }
}
