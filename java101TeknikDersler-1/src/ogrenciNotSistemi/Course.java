package ogrenciNotSistemi;

public class Course {

    // Dersin adı, kodu, ön eki, notu ve öğretmeni
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    // Constructor: Ders nesnesi oluşturulurken adı, kodu ve ön eki set edilir, notu başlangıçta 0 olarak atanır
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = null; // Başlangıçta öğretmen atanmamıştır, bu nedenle null olarak atanır
    }

    // Dersin öğretmenini eklemek için kullanılan metot
    void addTeacher(Teacher teacher) {
        // Eklenen öğretmenin branşı, dersin ön eki ile uyuşuyorsa öğretmen atanır
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }
    }

    // Dersin öğretmen bilgilerini ekrana yazdıran metot
    void printTeacher() {
        if (this.teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("Bu derse atanmış bir öğretmen yok.");
        }
    }
}
