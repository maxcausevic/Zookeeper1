public class Bat extends Mammal{
    public Bat(int energyLevel){
        super(300);
    }
    public int fly(){
        System.out.println("Screeeeech!!");
        return energyLevel -= 50;
    }
    public int eatHumans(){
        System.out.println("AAAAhhhhh!");
        return energyLevel += 25;
    }
    public int attackTown(){
        System.out.println("Cracks a blazing");
        return energyLevel -= 100;
    }
}