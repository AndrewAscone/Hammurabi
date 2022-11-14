import java.util.Random;
import java.util.Scanner;
public class TradingLand {
    public static Scanner scanner = new Scanner(System.in);
    public static int askBuyOrSellAcres(int acresOwned, int acresTradeCost, int bushelsOwned) {

        System.out.print(   "\n1. Buy Acres" +
                            "\n2. Sell Acres" +
                            "\n3. Skip" +
                            "\nEnter a selection from above: ");
        int choice = scanner.nextInt();

        if (choice == 1) return askHowManyAcresToBuy(acresTradeCost, bushelsOwned);
        if (choice == 2) return askHowManyAcresToSell(acresOwned);
        if (choice == 3) {
            System.out.println("No acres of land was bought or sold.");
            return 0;
        }
        else {
            System.out.println("Invalid entry.");
            return askBuyOrSellAcres(acresOwned, acresTradeCost, bushelsOwned);
        }
    }
    public static int askHowManyAcresToBuy(int acresTradeCost, int bushelsOwned) {

        System.out.println("\nHow many acres of land do you want to [buy?]");
        int acresToBuy = scanner.nextInt();

        if (acresToBuy < 0) {
            System.out.println("[ERROR] Please enter a positive number.");
            return askHowManyAcresToBuy(acresTradeCost, bushelsOwned);
        }

        if (((acresToBuy * acresTradeCost) > bushelsOwned)) {
            System.out.println("[NOTICE] You don't have enough bushels to buy " + acresToBuy + " acres of land.");
            return askHowManyAcresToBuy(acresTradeCost, bushelsOwned);
        } else {
            System.out.println("[NOTICE] You are able to buy " + acresToBuy + " acres of land.");
            return acresToBuy;
        }
    }
    public static int askHowManyAcresToSell(int acresOwned) {

        System.out.println("\nHow many acres of land to do you want to [sell?]");
        int acresToSell = scanner.nextInt();

        if (acresToSell < 0) {
            System.out.println("[ERROR] Please enter a positive number.");
            return askHowManyAcresToSell(acresOwned);
        }

        if (((acresToSell > acresOwned))) {
            System.out.println("[NOTICE] You don't have " + acresToSell + " acres of land to sell.");
            return askHowManyAcresToSell(acresOwned);
        } else {
            System.out.println("[NOTICE] You are able to sell " + acresToSell + " acres of land.");
            return acresToSell * -1;
        }
    }
    public static int tradeAcres(int acresOwned, int acresBuySell) {

        if (acresBuySell > 0) { return acresOwned + acresBuySell; }
        if (acresBuySell < 0) { return acresOwned - Math.abs(acresBuySell); }
        else return acresOwned;

    }
    public static int updateBushels(int bushelsOwned, int acresBuySell, int acresTradeCost) {

        if (acresBuySell > 0) { return bushelsOwned - (acresBuySell * acresTradeCost); }
        if (acresBuySell < 0) { return bushelsOwned + (Math.abs(acresBuySell) * acresTradeCost); }
        else return bushelsOwned;

    }
    public static int newCostOfLand() {
        Random rand = new Random();

        int newTradePrice = rand.nextInt(9) + 17; //random rage of 17-26

        return newTradePrice;
    }
}
