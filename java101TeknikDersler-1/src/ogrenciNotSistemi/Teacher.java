package ogrenciNotSistemi;

public class Teacher {

    // Öğretmenin adı, telefon numarası ve branşı
    String name;
    String mpno;
    String branch;

    // Constructor: Öğretmen nesnesi oluşturulurken adı, telefon numarası ve branşı set edilir
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    // Öğretmen bilgilerini ekrana yazdıran metot
    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);
    }
}
