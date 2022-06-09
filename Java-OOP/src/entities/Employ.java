package entities;

public class Employ {

    public String Name;

    public float grossSalary;

    public float tax;



    public String toStringEmploy() {
        return "Employee: " + Name + ", $ " + String.format("%.2f", grossSalary);
    }



}
