public class GorillaTest{
    public static void main(String[]args){
        Gorilla benny = new Gorilla();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.throwSomthing();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.eatBananas();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.eatBananas();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.throwSomthing();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.throwSomthing();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
        benny.climb();
        System.out.println("Benny's energy level: " + benny.getEnergyLevel());
    }
}