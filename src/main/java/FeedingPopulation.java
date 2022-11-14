import java.util.Random;
import java.util.Scanner;

public class FeedingPopulation {
    public static Scanner scanner = new Scanner(System.in);
    public static int askHowMuchGrainToFeedPeople(int bushelsOwned, int bushelsToSurvive) {

        System.out.print(   "\nEach person needs " + bushelsToSurvive+ " bushels to survive." +
                            "\nEnter the amount of bushels you wish to [feed] your population: ");
        int amountToFeed = scanner.nextInt();

        if (amountToFeed < 0) {
            System.out.println("[ERROR] Please enter a positive number.");
            return askHowMuchGrainToFeedPeople(bushelsOwned, bushelsToSurvive);
        }

        if(amountToFeed > bushelsOwned) {
            System.out.println("\n[NOTICE] You don't have " + amountToFeed + " bushels of grain to feed your population.");
            return askHowMuchGrainToFeedPeople(bushelsOwned, bushelsToSurvive);
        } else {
            System.out.println("\n[NOTICE] You are able to feed your population with " + amountToFeed + " bushels of grain.");
            return amountToFeed;
        }
    }
    public static int feedPopulationReturnDeaths(int population, int amountToFeed, int bushelsToSurvive) {

        return population - (int) (Math.floor(amountToFeed / bushelsToSurvive));
    }

    public static int updatePopulation(int population, int diedFromStarvation) {

        return population - diedFromStarvation;
    }

    public static int updateBushels(int bushelsOwned, int amountToFeed) {

        return bushelsOwned - amountToFeed;
    }

    public static boolean uprising(int population, int howManyPeopleStarved) {

        double pop = population;
        double starved = howManyPeopleStarved;

        if ((starved / pop) > 0.45) return true; //Return true if more than 45% of the people starve.
        else return false;
    }

    public static int immigrants(int population, int acresOwned, int bushelsOwned) { //if everyone is well-fed

        double pop = population;
        double acres = acresOwned;
        double bushels = bushelsOwned;

        return (int)((20 * acres + bushels) / (100 * pop) + 1);
    }

    public static int addImmigrants(int population, int immigrants) {

        return  population + immigrants;
    }
}
