import java.util.Random;
import java.util.Scanner;

public class MaintainCrops {
    public static Scanner scanner = new Scanner(System.in);

    public static int askHowManyAcresToPlant(int population, int acresOwned) {

        System.out.print(   "\nEach acre takes one bushel. Each citizen can till at most 10 acres of land." +
                            "\nEnter the amount of acres you wish to plant with bushels: ");
        int amountToPlant = scanner.nextInt();

        if (amountToPlant == 0){
            System.out.println("[NOTICE] No acres were planted with bushels of grain this year.");
            return 0;
        }
        // if have enough acres, but not enough "man power"
        if((amountToPlant > (population * 10)) && (amountToPlant <= acresOwned)) {
            System.out.println("[NOTICE] You're planting too much. You only have " + population +" people to tend the fields.");
            return askHowManyAcresToPlant(population, acresOwned);
        }
        //if you have enough "man power", but not enough acres
        if ((amountToPlant <= (population * 10)) && (amountToPlant > acresOwned)) {
            System.out.println("[NOTICE] You don't have enough land. You only own " + acresOwned + " acres.");
            return askHowManyAcresToPlant(population, acresOwned);
        }
        //if you have enough people AND land
        if ((amountToPlant <= (population * 10)) && (amountToPlant <= acresOwned)) {
            System.out.println("[NOTICE] You are able to plant " + amountToPlant + " acres with bushels of grain.");
            return amountToPlant;
        } else {
            System.out.println("[NOTICE] Your code broke at: Acres to Plant");
            return 0;
        }
    }

    public static int updateBushels(int bushelsOwned, int AmountToPlant) {

        return bushelsOwned - AmountToPlant;
    }

    public static int harvestRate() {
        //random num 1-6, each num of planted seed will harvest this amount
        Random rand = new Random();
        return rand.nextInt(6) + 1; //return num of bushels harvested
    }

    public static int getHarvest(int amountToPlant, int harvestRate) { //multiply

        return amountToPlant * harvestRate;
    }

    public static int addHarvest(int bushelsOwned, int harvested) {

        return bushelsOwned + harvested;
    }
}
