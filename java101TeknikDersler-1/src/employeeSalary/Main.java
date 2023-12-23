package employeeSalary;

public class Main {

    public static void main(String[] args) {
        // İki çalışan nesnesi oluşturuluyor
        Employee e1 = new Employee("Ahmet", 5000, 10, 2021);
        Employee e2 = new Employee("Mahmut", 3000, 10, 2019);

        // Çalışanın bilgileri ekrana yazdırılıyor
        System.out.println(e1);

        // Vergi hesaplaması ve sonucu ekrana yazdırılıyor
        System.out.println(" Vergi " + (e1.tax(e1)));

        // Maaş artışı hesaplaması ve sonucu ekrana yazdırılıyor
        System.out.println("Maas Artisi " + (e1.raiseSalary(e1)));

        // Bonus hesaplaması ve sonucu ekrana yazdırılıyor
        System.out.println("Bonus " + e1.bonus(e1));

        // Vergi ve bonuslar ile birlikte maaş hesaplanıyor ve sonucu ekrana yazdırılıyor
        System.out.println("Vergi ve Bonuslar ile birlikte Maas:"
                + ((e1.salary - e1.tax(e1)) + e1.bonus(e1)));

        // Toplam maaş hesaplanıyor ve sonucu ekrana yazdırılıyor
        System.out.println("Toplam Maas:" + (e1.salary = (e1.salary - e1.tax(e1)) + e1.raiseSalary(e1) + e1.bonus(e1)));
    }
}
