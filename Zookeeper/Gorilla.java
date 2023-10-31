public class Gorilla extends Mammal{
    public void throwSomthing(){
        System.out.println("The Gorilla threw somthing!");
        this.setEnegyLevel(this.getEnergyLevel() - 5 );
    }
    public void eatBananas(){
        System.out.println("The Gorilla ate a Banana!");
        this.setEnegyLevel(this.getEnergyLevel() + 10);
    }
    public void climb(){
        System.out.println("The Gorilla climbed a tree!");
        this.setEnegyLevel(this.getEnergyLevel() - 10);
    }
}