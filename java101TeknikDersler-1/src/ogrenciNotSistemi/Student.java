package ogrenciNotSistemi;

public class Student {

    // Öğrencinin aldığı dersler
    Course c1;
    Course c2;
    Course c3;

    // Öğrenci bilgileri
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    // Constructor: Öğrenci nesnesi oluşturulurken dersleri, ismi, numarası ve sınıf bilgileri set edilir
    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0; // Ortalama başlangıçta 0.0 olarak atanır
        this.isPass = false; // Geçme durumu başlangıçta false olarak atanır
    }

    // Öğrenciye notlarını toplu olarak eklemek için kullanılan metot
    void addBulkExamNote(int note1, int note2, int note3) {
        // Notlar belirtilen aralıklarda ise ilgili derslere atanır
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    // Geçme durumunu kontrol eden ve ekrana bilgi yazdıran metot
    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;

        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz");
            String formattedAverage = String.format("%.2f", avarage);
            System.out.println(formattedAverage);
            this.isPass = true;
        } else {
            System.out.println("Sınıfta Kaldınız");
            String formattedAverage = String.format("%.2f", avarage);
            System.out.println(formattedAverage);
            this.isPass = false;
        }
    }

    // Öğrencinin notlarını ekrana yazdıran metot
    void printNote() {
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c2.name + " Notu\t:" + c2.note);
        System.out.println(c3.name + " Notu\t:" + c3.note);
    }
}
