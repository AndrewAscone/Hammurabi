import java.util.Random;
public class UnnaturalDisasters {

    public static int plagueDeaths(int population) {
        Random rand = new Random();
        int randPeopleDeath = rand.nextInt(100);
        if (randPeopleDeath <= 15) {
            String disaster = "";
            Random selectDisaster = new Random();
            int whichDisaster = selectDisaster.nextInt(4) + 1;
            switch (whichDisaster) {
                case 1:
                    disaster = "[NOTICE] A plague occurred, killing half your population!";
                    break;
                case 2:
                    disaster = "[NOTICE] An earthquake has killed half your population";
                    break;
                case 3:
                    disaster = "[NOTICE] A tsunami swells, drowning half your population";
                    break;
                case 4:
                    disaster = "[NOTICE] A volcano erupted, killing half your population";
                    break;


                //System.out.println("In plague death: " + (population/2) + " , w Round is " + Math.round(population/2));



            }
            System.out.println(disaster);
            return Math.round(population / 2);
            //15% chance each year that 1/2 your population dies

        }
        System.out.println("[NOTICE] You've luckily avoided any disasters this year!");
        return 0; //return num of deaths
    }


    public static int updatePopulation(int population, int plagueDeaths) {

        return population - plagueDeaths;
    }

    public static int bushelsEatenByRats(int bushelsOwned) {
        Random rand = new Random();
        int ratAttack = rand.nextInt(100);
        double ratFeast = rand.nextInt(20) + 10;

        if(ratAttack <= 40) { // Percentage of occurring
            String bushelsLost = "";
            Random whyIsFoodGone = new Random();
            int foodGone = whyIsFoodGone.nextInt(4) + 1;
            int eaten = (int) ((ratFeast / 100) * bushelsOwned);
            switch (foodGone) {
                case 1:
                    bushelsLost = "[NOTICE] Rats have eaten " + eaten + " of your bushels this year!";
                    break;
                case 2:
                    bushelsLost = "[NOTICE] Wildfires have consumed " + eaten + " of your bushels this year!";
                    break;
                case 3:
                    bushelsLost = "[NOTICE] Barbarians have stolen " + eaten + " of your bushels this year!";
                    break;
                case 4:
                    bushelsLost = "[NOTICE] Heavy rains have drowned  " + eaten + " of your bushels this year!";
                    break;
            }
            System.out.println(bushelsLost);
            return eaten;

        }

        System.out.println("[NOTICE] Nothing has claimed any of your bushels this year!");
        return 0;
        //40% chance of rat infestation, if so 10-30% of grain will be eaten
        //return amount eaten
    }

    public static int updateBushels(int bushelsOwned, int bushelsEatenByRats) {

        return bushelsOwned - bushelsEatenByRats;
    }


}
