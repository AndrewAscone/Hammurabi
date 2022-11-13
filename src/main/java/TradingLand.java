import java.util.Random;
import java.util.Scanner;
public class TradingLand {

    Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int landBought = 0;

    public static int landSold = 0;

    public static int buyOrSellChoice = 0;
    public static int askBuyOrSellAcres(int acresOwned, int acresTradeCost, int bushelsOwned) {

        System.out.print(   "\n1. Buy Acres" +
                            "\n2. Sell Acres" +
                            "\n3. Skip" +
                            "\nEnter a number: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        buyOrSellChoice = choice;

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

        System.out.println("\nHow many acres of land do you want to buy?");
        int acresToBuy = scanner.nextInt();

        if (((acresToBuy * acresTradeCost) > bushelsOwned)) {
            System.out.println("[NOTICE] You don't have enough bushels to buy " + acresToBuy + " acres of land.");
            return askHowManyAcresToBuy(acresTradeCost, bushelsOwned);
        } else {
            System.out.println("[NOTICE] You are able to buy " + acresToBuy + " acres of land.");
            landBought = acresToBuy;
            return acresToBuy;
        }
    }
    public static int askHowManyAcresToSell(int acresOwned) {

        System.out.println("\nHow many acres of land to do you want to sell?");
        int acresToSell = scanner.nextInt();

        if (((acresToSell > acresOwned))) {
            System.out.println("[NOTICE] You don't have " + acresToSell + " acres of land to sell.");
            return askHowManyAcresToSell(acresOwned);
        } else {
            System.out.println("[NOTICE] You are able to sell " + acresToSell + " acres of land.");
            landSold = acresToSell;
            return acresToSell;
        }
    }
    public static int tradeAcres(int acresOwned, int acresBuySell) {
        int acresToBuy = landBought;
        int acresToSell = landSold;

        if(buyOrSellChoice == 1){
        return acresOwned = acresOwned + acresToBuy;
        }

        else if(buyOrSellChoice == 2){
        return acresOwned = acresOwned - acresToSell;
        }

        return acresOwned;

    }
    public static int updateBushels(int bushelsOwned, int acresBuySell, int acresTradeCost) {
        int acresToBuy = landBought;
        int acresToSell = landSold;

        if(buyOrSellChoice == 1){
            return bushelsOwned = bushelsOwned - (acresBuySell * acresTradeCost);
        }

        else if(buyOrSellChoice == 2){
            return bushelsOwned = bushelsOwned + (acresBuySell * acresTradeCost);
        }

        return bushelsOwned;
    }
    public static int newCostOfLand() {
        Random rand = new Random();
        //random rage of 17-26
        int newTradePrice = rand.nextInt(9) + 17;

        return newTradePrice; //return new price of land for next year
    }
}
