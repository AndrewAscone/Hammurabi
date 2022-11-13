import java.util.Random;
public class UnnaturalDisasters {

    public static int plagueDeaths(int population) {
        Random rand = new Random();
        int randPeopleDeath = rand.nextInt(100);
        if(randPeopleDeath <= 15) {
            System.out.println("[NOTICE] A plague occured killing half your population!");
            //System.out.println("In plague death: " + (population/2) + " , w Round is " + Math.round(population/2));
            return Math.round(population/2);
        }
        //15% chance each year that 1/2 your population dies
        System.out.println("[NOTICE] You've luckily avoided a plague this year!");
        return population; //return num of deaths
    }

    public static int updatePopulation(int population, int plagueDeaths) {

        return population - plagueDeaths;
    }

    public static int bushelsEatenByRats(int bushelsOwned) {
        Random rand = new Random();
        int ratAttack = rand.nextInt(100);
        double ratFeast = rand.nextInt(20) + 10;

        if(ratAttack <= 40) { // Percentage of occuring
            int eaten = (int)((ratFeast/100) * bushelsOwned);
            System.out.println("[NOTICE] Rats have eaten " + eaten + " of your bushels this year!");
            return eaten;
        }

        System.out.println("[NOTICE] Rats have not eaten any of your bushels this year!");
        return bushelsOwned;
        //40% chance of rat infestation, if so 10-30% of grain will be eaten
        //return amount eaten
    }

    public static int updateBushels(int bushelsOwned, int bushelsEatenByRats) {

        return bushelsOwned - bushelsEatenByRats;
    }

    public static int earthquake() {
        System.out.println("[NOTICE] An earthquake as occured and caused fissure killing 5% of your people!");
        return 0;
    }


}
