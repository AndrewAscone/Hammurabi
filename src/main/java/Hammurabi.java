import com.sun.tools.javac.Main;

public class Hammurabi {

    public static void main(String[] args) {
        new Hammurabi().playGame();
    }
    void playGame() {

        //Starting inventory
        int bushelsOwned = 3000;
        int population = 100;
        int acresOwned = 1000;

        //Starting conditions
        int acresTradeCost = 10;
        int bushelsToSurvive = 20;

        //Yearly update
        int yearCount = 0;
        int starvationDeaths = 0;
        int immigrants = 0;
        int harvestRate = 0;
        int plagueDeaths = 0;
        int bushelsEatenedByRats = 0;

        while (yearCount < 10) {

                getYearlyUpdate(    yearCount, starvationDeaths, immigrants, harvestRate, plagueDeaths, bushelsEatenedByRats,
                                    bushelsOwned, acresOwned, population,
                                    acresTradeCost);

                int acresBuySell = TradingLand.askBuyOrSellAcres(acresOwned, acresTradeCost, bushelsOwned);
                acresOwned = TradingLand.tradeAcres(acresOwned, acresBuySell);
                bushelsOwned = TradingLand.updateBushels(bushelsOwned, acresBuySell, acresTradeCost);

                getYearlyUpdate(    yearCount, starvationDeaths, immigrants, harvestRate, plagueDeaths, bushelsEatenedByRats,
                                    bushelsOwned, acresOwned, population,
                                    acresTradeCost);

                int amountToFeed = FeedingPopulation.askHowMuchGrainToFeedPeople(bushelsOwned, bushelsToSurvive);
                starvationDeaths = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
                population = FeedingPopulation.updatePopulation(population, starvationDeaths);
                bushelsOwned = FeedingPopulation.updateBushels(bushelsOwned, amountToFeed);

                getYearlyUpdate(    yearCount, starvationDeaths, immigrants, harvestRate, plagueDeaths, bushelsEatenedByRats,
                                    bushelsOwned, acresOwned, population,
                                    acresTradeCost);

                int amountToPlant = MaintainCrops.askHowManyAcresToPlanet(population, acresOwned);
                bushelsOwned = MaintainCrops.updateBushels(bushelsOwned, amountToPlant);

                plagueDeaths = UnnaturalDisasters.plagueDeaths(population);
                population = UnnaturalDisasters.updatePopulation(population, plagueDeaths);

                if (FeedingPopulation.uprising(population, starvationDeaths)) {
                    System.out.println("[GAME OVER] You have starved more than 45% of your population!");
                    break;
                }

                if (starvationDeaths == 0) {
                    immigrants = FeedingPopulation.immigrants(population, acresOwned, bushelsOwned);
                    population = FeedingPopulation.addImmigrants(population, immigrants);
                }

                harvestRate = MaintainCrops.harvestRate();
                int harvested = MaintainCrops.getHarvest(amountToPlant, harvestRate);
                bushelsOwned = MaintainCrops.addHarvest(bushelsOwned, harvestRate);

                bushelsEatenedByRats = UnnaturalDisasters.bushelsEatenByRats(bushelsOwned);
                bushelsOwned = UnnaturalDisasters.updateBushels(bushelsOwned, bushelsEatenedByRats);

                acresTradeCost = TradingLand.newCostOfLand();

                yearCount++;
        }

        getFinalUpdate();
    }

    public static void getYearlyUpdate(int yearCount, int starvationDeaths, int immigrants, int harvestRate, int plagueDeaths, int bushelsEatenedByRats,
                                       int bushelsOwned, int acresOwned, int population,
                                       int acresTradeCost) {

        System.out.println( "--------------------------------------------" +
                            "\nWelcome to Year " + yearCount +
                            "\n[Previous Year Recap]" +
                            "\nDeaths from starvation: " + starvationDeaths +
                            "\nDeaths from plague: " + plagueDeaths +
                            "\nPopulation growth: " + immigrants +
                            "\nBushels of grains harvested per acre of land: " + harvestRate +
                            "\nBushels lost from rats eating them: " + bushelsEatenedByRats);


        System.out.println( "\n[Inventory]" +
                            "\nBushels owned: " + bushelsOwned +
                            "\nAcres owned: " + acresOwned +
                            "\nPopulation: " + population);

        System.out.println( "\n[Market Price]" +
                            "\nCost of acres of land trading: " + acresTradeCost);
    }

    public static void getFinalUpdate() {

    }
}