package employeeSalary;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    // Constructor (Kurucu metod)
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    int tax(Employee employee) {
        if (employee.salary < 1000) {
            return employee.salary;
        } else return (employee.salary * 3) / 100;
    }

    // Bonus hesaplama metodu
    int bonus(Employee employee) {
        int bonus;
        if (employee.workHours * 5 > 40) {
            return bonus = employee.workHours * 30;
        } else return 0;
    }

    // Maaş artışı hesaplama metodu
    int raiseSalary(Employee employee) {
        int zam;
        if (2023 - employee.hireYear <= 10) {
            return zam = (employee.salary * 5) / 100;
        } else if (2023 - employee.hireYear > 9 && 2023 - employee.hireYear < 20) {
            return zam = (employee.salary * 10) / 100;

        } else if (2023 - employee.hireYear < 19) {
            return zam = (employee.salary * 15) / 100;
        }
        return employee.salary;
    }

    // toString metodu, nesnenin bilgilerini metin olarak döndürür
    @Override
    public String toString() {
        return "Employee{" + "\n" +
                " Adi='" + name + '\'' + "\n" +
                " Maasi=" + salary + "\n" +
                " Calisma Saati=" + workHours + "\n" +
                " Baslangic Yili=" + hireYear +
                '}';
    }
}
