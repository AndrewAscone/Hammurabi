
public class EndGameEval {
    public static void getFinalUpdate(int yearCount, int starvationDeaths, int immigrants,
                                      int harvestRate, int plagueDeaths, int bushelsEatenedByRats,
                                      int bushelsOwned, int acresOwned, int population,
                                      int totalDeaths, double totalPercentageStarved) {

        double acresPerPerson = acresOwned / (population * 1.0);
        double perYearAvgPercentStarved = ((totalPercentageStarved / 3.0 ) * 100);

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

        System.out.printf("In your 10-year term of office, %.2f percent of the population starved per year on average.", perYearAvgPercentStarved);

        System.out.println("\nA total of " + totalDeaths + " people died!");

        System.out.printf("You started with 10 acres per person and ended with %.2f acres per person", acresPerPerson);

        performanceStatement(perYearAvgPercentStarved, acresPerPerson);
    }
    public static void performanceStatement(double perYearAvgPercentStarved, double acresPerPerson) {

        if(perYearAvgPercentStarved >= 33
                || acresPerPerson < 7) {
            System.out.println("\nYou are impeached and thrown out of office!");
        }

        else if(perYearAvgPercentStarved >= 10 && perYearAvgPercentStarved < 33
                || acresPerPerson < 9 && acresPerPerson >= 7) {
            System.out.println("\nYou have completed a heavy-handed performance!");
        }

        else if(perYearAvgPercentStarved >= 3 && perYearAvgPercentStarved < 10
                || acresPerPerson < 10 && acresPerPerson >= 9) {
            System.out.println("\nYour performance could have been better...");
        }

        else if (perYearAvgPercentStarved < 3
               || acresPerPerson >= 10) {
            System.out.println("\nA FANTASTIC PERFORMANCE!");
        }
    }
}

