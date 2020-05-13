import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList monsters = new ArrayList<Monster>();
        System.out.println("Hello World");
        System.out.println("How many monsters do you want to fight with?");
        int countMonsters = sc.nextInt();

        for (int i=0; i < countMonsters; i++){
            System.out.println("What is the name of the monster?");
            String name = sc.next();
            System.out.println("What is the health bar of the monster?");
            Double health = sc.nextDouble();
            System.out.println("What is the attack power of the monster?");
            Double attack = sc.nextDouble();
            System.out.println("What is the defense power of the monster?");
            Double defense = sc.nextDouble();
            System.out.println("What is the race of your monster?");
            String race = sc.next();
            System.out.println("What is the color of your monster?");
            String color = sc.next();
            Monster Mnst = new Monster(name.toLowerCase(),
                    health,
                    attack,
                    defense,
                    race.toLowerCase(),
                    color.toLowerCase()
                    );
            monsters.add(Mnst);
            System.out.println("Monster");
            System.out.println("Name: " + Mnst.name);
            System.out.println("Health: " + Mnst.health);
            System.out.println("Attack: " + Mnst.attackPower);
            System.out.println("Defense: " + Mnst.defensePower);
            System.out.println("Race: " + Mnst.race);
            System.out.println("Color: " + Mnst.skinColor);
        }

    }
}
