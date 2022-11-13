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
        int yearCount = 8;
        int starvationDeaths = 0;
        int immigrants = 0;
        int harvestRate = 0;
        int plagueDeaths = 0;
        int bushelsEatenedByRats = 0;

        //End game info
        int totalDeaths = 0;
        double percentageStarved = 0;

        System.out.println("Hammurabi, can you make it through 10 years?!");

        while (yearCount < 11) {
            // Initial Menu
            getYearlyUpdate(    yearCount, starvationDeaths, immigrants,
                    harvestRate, plagueDeaths, bushelsEatenedByRats,
                    bushelsOwned, acresOwned, population,
                    acresTradeCost);

            // Prompts Acres & calculates
            int acresBuySell = TradingLand.askBuyOrSellAcres(acresOwned, acresTradeCost, bushelsOwned);
            acresOwned = TradingLand.tradeAcres(acresOwned);
            bushelsOwned = TradingLand.updateBushels(bushelsOwned, acresBuySell, acresTradeCost);

            // Menu with Acre updates
            getYearlyUpdate(    yearCount, starvationDeaths, immigrants,
                    harvestRate, plagueDeaths, bushelsEatenedByRats,
                    bushelsOwned, acresOwned, population,
                    acresTradeCost);

            // Prompts Feeding & calculates
            int amountToFeed = FeedingPopulation.askHowMuchGrainToFeedPeople(bushelsOwned, bushelsToSurvive);
            starvationDeaths = FeedingPopulation.feedPopulationReturnDeaths(population, amountToFeed, bushelsToSurvive);
            population = FeedingPopulation.updatePopulation(population, starvationDeaths);
            int populationWithoutDisasters = population;
            bushelsOwned = FeedingPopulation.updateBushels(bushelsOwned, amountToFeed);

            // Menu with Feeding updates
            getYearlyUpdate(    yearCount, starvationDeaths, immigrants,
                    harvestRate, plagueDeaths, bushelsEatenedByRats,
                    bushelsOwned, acresOwned, population,
                    acresTradeCost);

            // Prompts Planting & calculates
            int amountToPlant = MaintainCrops.askHowManyAcresToPlant(population, acresOwned, bushelsOwned);
            bushelsOwned = MaintainCrops.updateBushels(bushelsOwned, amountToPlant);

            // Runs RNG "Plague" and updates if true
            plagueDeaths = UnnaturalDisasters.plagueDeaths(population);
            population = UnnaturalDisasters.updatePopulation(population, plagueDeaths);

            // if starvation is over 45%, end game
            if (FeedingPopulation.uprising(populationWithoutDisasters, starvationDeaths)) {
                System.out.println("[GAME OVER] You have starved more than 45% of your population!");
                break;
            }

            // if starvation is 0, generate "immigrants"
            if (starvationDeaths == 0) {
                immigrants = FeedingPopulation.immigrants(population, acresOwned, bushelsOwned);
                population = FeedingPopulation.addImmigrants(population, immigrants);
            }

            // Generate harvest rate, calculate and update bushels for next year
            harvestRate = MaintainCrops.harvestRate();
            int harvested = MaintainCrops.getHarvest(amountToPlant, harvestRate);
            bushelsOwned = MaintainCrops.addHarvest(bushelsOwned, harvested);

            // Runs RNG "Rats" and updates if true
            bushelsEatenedByRats = UnnaturalDisasters.bushelsEatenByRats(bushelsOwned);
            bushelsOwned = UnnaturalDisasters.updateBushels(bushelsOwned, bushelsEatenedByRats);

            // Runs RNG new trade cost for acres for next year
            acresTradeCost = TradingLand.newCostOfLand();

            // Info for end game eval
            totalDeaths += starvationDeaths;
            System.out.println("Total Death: " + totalDeaths);
            percentageStarved += (starvationDeaths / population);
            System.out.println("Total percentage starved: " +percentageStarved);

            // Increment year
            yearCount++;
        }

        if(yearCount == 11) {
            //---- Final menu update ---
            EndGameEval.getFinalUpdate(yearCount, starvationDeaths, immigrants,
                    harvestRate, plagueDeaths, bushelsEatenedByRats,
                    bushelsOwned, acresOwned, population,
                    totalDeaths, percentageStarved);
        }
    }

    public static void getYearlyUpdate(int yearCount, int starvationDeaths, int immigrants, int harvestRate, int plagueDeaths, int bushelsEatenedByRats,
                                       int bushelsOwned, int acresOwned, int population,
                                       int acresTradeCost) {
        System.out.println("----------------------------------------------------------------------");

        System.out.println( "Welcome to Year " + yearCount +
                "\n[Previous Year Recap]" +
                "\nDeaths from starvation: " + starvationDeaths +
                "\nDeaths from unnatural disaster: " + plagueDeaths +
                "\nPopulation growth: " + immigrants +
                "\nBushels of grains harvested per acre of land: " + harvestRate +
                "\nBushels lost from unnatural disaster: " + bushelsEatenedByRats);


        System.out.println( "\n[Inventory]" +
                "\nBushels owned: " + bushelsOwned +
                "\nAcres owned: " + acresOwned +
                "\nPopulation: " + population);

        System.out.println( "\n[Market Price]" +
                "\nCost of acres of land trading: " + acresTradeCost);

        System.out.println("----------------------------------------------------------------------");
    }

}
