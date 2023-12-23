package boksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    int dodge;

    int startShans;


    public Fighter(String name, int damage, int health, int weight, int dodge, int startShans) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 20) {
            this.dodge = dodge;
        } else this.dodge = 0;

        if (startShans >= 0 && startShans <= 50) {
            this.startShans = startShans;
        } else this.startShans = 0;


    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen hasari blokladi");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isStart() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.startShans;
    }

}



