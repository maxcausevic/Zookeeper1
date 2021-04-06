public class Gorilla extends Mammal {
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
    public int throwSomething(){
        System.out.println("The gorilla has thrown something.");
        return energyLevel -= 3;
    }
    public int eatBananas(){
        System.out.println("The gorilla is eating bananas");
        return energyLevel += 10;

    }
    public int climb(){
        System.out.println("The gorilla climbed");
        return energyLevel -= 10;
    }
}

