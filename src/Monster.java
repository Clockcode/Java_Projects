import java.awt.*;

public class Monster extends Alive {

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
