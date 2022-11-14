import java.util.Random;
import java.util.Scanner;

public class MaintainCrops {
    public static Scanner scanner = new Scanner(System.in);
    public static int askHowManyAcresToPlant(int population, int acresOwned, int bushelsOwned) {

        System.out.print(   "\nEach acre takes one bushel. Each citizen can till at most 10 acres of land." +
                            "\nEnter the amount of acres you wish to [plant] with bushels: ");
        int amountToPlant = scanner.nextInt();

        if (amountToPlant < 0) {
            System.out.println("[ERROR] Please enter a positive number.");
            return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
        }

        if (amountToPlant == 0){
            System.out.println("[NOTICE] No acres were planted with bushels of grain this year.");
            return 0;
        }
        // if you have enough bushels
        if(amountToPlant <= bushelsOwned) {
            // if you have enough acres, but not enough "man power"
            if ((amountToPlant > (population * 10)) && (amountToPlant <= acresOwned)) {
                System.out.println("[NOTICE] You're planting too much. You only have " + population + " people to tend the fields.");
                return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
            }
            //if you have enough "man power", but not enough acres
            if ((amountToPlant <= (population * 10)) && (amountToPlant > acresOwned)) {
                System.out.println("[NOTICE] You don't have enough land. You only own " + acresOwned + " acres.");
                return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
            }
            //if you have enough people AND land
            if ((amountToPlant <= (population * 10)) && (amountToPlant <= acresOwned)) {
                System.out.println("[NOTICE] You are able to plant " + amountToPlant + " acres with bushels of grain.");
                return amountToPlant;
            }
            //if you don't have enough people AND land
            if ((amountToPlant > (population * 10)) && (amountToPlant > acresOwned)) {
                System.out.println("[NOTICE] You only own " + acresOwned + " acres and only have " + population + " people to tend the fields.");
                return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
            }

        }
        // if you don't have enough bushels
        if(amountToPlant > bushelsOwned){
            System.out.println("[NOTICE] You only have " + bushelsOwned + " bushels to plant!");
            return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
        } else {
            System.out.println("[ERROR] Program broke at taking in acres to plant!");
            return askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
        }
    }

    public static int updateBushels(int bushelsOwned, int AmountToPlant) {

        return bushelsOwned - AmountToPlant;
    }

    public static int harvestRate() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // return rate of bushels per acre (1-6)
    }

    public static int getHarvest(int amountToPlant, int harvestRate) {

        return amountToPlant * harvestRate;
    }

    public static int addHarvest(int bushelsOwned, int harvested) {

        return bushelsOwned + harvested;
    }
}
