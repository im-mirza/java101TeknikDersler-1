package ogrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        // Öğretmen nesneleri oluşturuluyor
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Arif Hoca", "000", "FZK");
        Teacher t3 = new Teacher("Farhad Hoca", "222", "BIO");

        // Ders nesneleri oluşturuluyor ve öğretmenleri atanıyor
        Course tarih = new Course("TARIH", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("FIZIK", "102", "FZK");
        fizik.addTeacher(t2);

        Course bioloji = new Course("BIOLOJI", "102", "BIO");
        bioloji.addTeacher(t3);

        // Öğrenci nesneleri oluşturuluyor ve derslere atanıyor
        Student s1 = new Student(tarih, fizik, bioloji, "Ramin", "1054", "1");
        Student s2 = new Student(tarih, fizik, bioloji, "Rasim", "1054", "1");
        Student s3 = new Student(tarih, fizik, bioloji, "Ilgar", "1054", "1");

        // Öğrencilere notlar ekleniyor, notlar yazdırılıyor ve geçme durumları kontrol ediliyor
        s1.addBulkExamNote(100, 30, 72);
        s1.printNote();
        s1.isPass();
        System.out.println("=====================");

        s2.addBulkExamNote(45, 70, 20);
        s2.printNote();
        s2.isPass();
        System.out.println("=====================");

        s3.addBulkExamNote(78, 60, 100);
        s3.printNote();
        s3.isPass();
    }
}
