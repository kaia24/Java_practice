public class Bat extends Mammal{
public Bat(){
    int energy = 300;
    this.setEnegyLevel(energy);
}
public void fly(){
    this.setEnegyLevel(this.getEnergyLevel() - 50);
    System.out.println("The bat flaps its wings!");
}
public void eatHumans(){
    this.setEnegyLevel(this.getEnergyLevel() + 25);
    System.out.println("The Bat had a  yummy snack (:!");
}
public void attackTown(){
    this.setEnegyLevel(this.getEnergyLevel() - 100);
    System.out.println("The town is having a bad time!");
}
}