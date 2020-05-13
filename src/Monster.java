import java.awt.*;

public class Monster {
    String name;
    double health;
    double attackPower;
    double defensePower;
    String race;
    String skinColor;
    //Constructor
     public Monster(String inputName,
                    double inputHealth,
                    double inputAttackPower,
                    double inputDefensePower,
                    String inputRace,
                    String inputSkinColor)
     {
         this.name = inputName;
         this.health = inputHealth;
         this.attackPower = inputAttackPower;
         this.defensePower = inputDefensePower;
         this.race = inputRace;
         this.skinColor = inputSkinColor;
     }

     public void changeRace(String inputRace){
         String lowercaseRace = inputRace.toLowerCase();
         this.race = lowercaseRace;
     }
}
