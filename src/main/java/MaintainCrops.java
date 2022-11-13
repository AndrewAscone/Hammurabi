import java.util.Random;
import java.util.Scanner;

public class MaintainCrops {
    public static Scanner scanner = new Scanner(System.in);

    public static int askHowManyAcresToPlant(int population, int acresOwned) {
        //Hammurabi.getYearlyUpdate();

        System.out.print(   "\nEach acre takes one bushel. Each citizen can till at most 10 acres of land." +
                            "\nEnter the amount of acres you wish to plant with bushels: ");
        int AmountToPlant = scanner.nextInt();

        if((AmountToPlant > (population * 10)) && (AmountToPlant <= acresOwned)) {
            System.out.println("[NOTICE] You're planting too much. You only have " + population +" people to tend the fields.");
            return askHowManyAcresToPlant(population, acresOwned);
        }
        //Not working?
        if ((AmountToPlant <= (population * 10)) && (AmountToPlant > acresOwned)) {
            System.out.println("[NOTICE] You don't have enough land. You only own " + acresOwned + " acres.");
            return askHowManyAcresToPlant(population, acresOwned);
        }
        if ((AmountToPlant <= (population * 10)) && (AmountToPlant <= acresOwned)) {
            System.out.println("[NOTICE] You are able to plant " + AmountToPlant + " acres with bushels of grain.");
            return AmountToPlant;
        } else {
            System.out.println("[NOTICE] No acres were planted with bushels of grain this year.");
            return 0;
        }
    }

    public static int updateBushels(int bushelsOwned, int AmountToPlant) {

        return 0;
    }

    public static int harvestRate() {
        //random num 1-6, each num of planted seed will harvest this amount
        Random rand = new Random();
        return rand.nextInt(6) + 1; //return num of bushels harvested
    }

    public static int getHarvest(int amountToPlant, int harvestRate) { //multiply

        return 0;
    }

    public static int addHarvest(int bushelsOwned, int harvested) {

        return 0;
    }
}
