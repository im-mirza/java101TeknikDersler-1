package boksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Elbrus",10,100,74,100,40);
        Fighter f2=new Fighter("Ramiz",20,80,60,50,30);
        Ring ring = new Ring(f1,f2,50,80);
        ring.run();
    }
}
