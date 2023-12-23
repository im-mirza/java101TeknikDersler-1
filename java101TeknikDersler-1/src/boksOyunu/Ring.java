package boksOyunu;

public class Ring {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isChek()) {
            while (this.f1.health > 0 && this.f2.health > 0) {

                System.out.println("=========YENI RAUND========");
                if (f1.isStart()) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                } else if (f2.isStart()) {
                    this.f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }

                System.out.println(f2.name + " " + this.f2.health);
                System.out.println(f1.name + " " + this.f1.health);

            }
        } else System.out.println("Sporcularin Skletleri Uymuyor");
    }

    boolean isChek() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));

    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandi");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandi");
            return true;
        }
        return false;
    }


}
