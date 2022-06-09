package entities;

public class Employ {

    public String Name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100.00);
    }

    public String toString() {
        return "Employee: " + Name + ", $ " + String.format("%.2f", NetSalary());
    }



}
