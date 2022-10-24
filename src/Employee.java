public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax(double salary){
        if(salary < 1000){
            return salary;
        }

        return (salary*3)/100;
    }

    private double bonus(double workHours){
        if(workHours > 40){
            double bonusPay = (workHours - 40) * 30;
            return bonusPay;
        }

        return 0;
    }

    private double raiseSalary(int hireYear){
        int availableYear = 2021;

        if (availableYear - hireYear < 10){
            return (salary * 5) / 100;
        } else if (availableYear - hireYear > 9 && availableYear - hireYear < 20) {
            return (salary * 10) / 100;
        } else if (availableYear - hireYear > 19) {
            return (salary * 15) / 100;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax= " + tax(salary) +
                ", bonus= " + bonus(workHours) +
                ", raiseSalary= " + raiseSalary(hireYear) +
                ", salaryWithTaxAndBonus= " + (salary - tax(salary) + bonus(workHours)) +
                ", totalSalary= " + (salary + raiseSalary(hireYear)) +
                '}';
    }

}
