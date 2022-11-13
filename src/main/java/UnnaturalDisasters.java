import java.util.Random;
public class UnnaturalDisasters {

    public static int plagueDeaths(int population) {
        Random rand = new Random();
        int randPeopleDeath = rand.nextInt(100);
        if(randPeopleDeath <= 15) {
            System.out.println("[NOTICE] A plague occured killing half your population!");
            System.out.println("In plague death: " + (population/2) + " , w Round is " + Math.round(population/2));
            return Math.round(population/2);
        }
        //15% chance each year that 1/2 your population dies
        System.out.println("[NOTICE] You've luckily avoided a plague this year!");
        return population; //return num of deaths
    }

    public static int updatePopulation(int population, int plagueDeaths) {

        return population - plagueDeaths;
    }

    public static int bushelsEatenByRats(int bushels) {
        Random rand = new Random();
        int ratAttack = rand.nextInt(100);
        double ratFeast = rand.nextInt(20) + 10;
        if(ratAttack <= 40) {
            return bushels - (int)(Math.round(ratFeast/100) * bushels);
        }
        return bushels;

        //40% chance of rat infestation, if so 10-30% of grain will be eaten
        //return amount eaten
    }

    public static int updateBushels(int bushelsOwned, int bushelsEatenByRats) {

        return bushelsOwned - bushelsEatenByRats;
    }

}
