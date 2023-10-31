public class Mammal{
    private int energyLevel=100;
    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return energyLevel;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnegyLevel(int currentEnergy){
        this.energyLevel=currentEnergy;
    }
}