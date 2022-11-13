public class EndGameEval {

    public static void getFinalUpdate(int yearCount, int starvationDeaths, int immigrants,
                                      int harvestRate, int plagueDeaths, int bushelsEatenedByRats,
                                      int bushelsOwned, int acresOwned, int population,
                                      int totalDeaths, double percentageStarved) {

        double acresPerPerson = acresOwned / population;

        System.out.println( "\nWelcome to Year " + yearCount +
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

        System.out.println("\nCongratulations! You have completed 10 years!");

        System.out.println( "In your 10-year term of office, " + ((percentageStarved / 10) * 100) +
                " percent of the population starved per year on average, .i.e., a total of" + totalDeaths +
                " people died!");

        System.out.println("You started with 10 acres per person and ended with " + acresPerPerson + "acres per person");

        performanceStatement();
    }
    public static void performanceStatement() {

        System.out.println("Hello!");
        //if more than one third of the people starved to death or you don't have at least 7 acres per person.
        //You are impeached and thrown out of office

        //if more than 10% of the people starved to death or you don't have at least 9 acres per person.
        //You have completed a "Heavy-handed" performance

        //if more than 3% of the people starved to death or you don't have at least 10 acres per person.
        //Your performance "could have been better"

        //Otherwise, fewer than 3% of the people starving to death and having ten or more acres per person.
        //You've completed "A fantastic performance", with
    }
}

