public class BatTest{
    public static void main(String[]args){
        Bat batty = new Bat();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.attackTown();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.eatHumans();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.eatHumans();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.fly();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.fly();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.attackTown();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());
        batty.attackTown();
        System.out.println("Batty's energy level: " + batty.getEnergyLevel());

    }
}