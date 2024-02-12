package main;

public class Ship extends Vehicle {

    public Ship (String manufactuer, String model, int maxSpeed){
        super("Laiva", manufactuer, model, maxSpeed);
        engines.add(new Engine("Wärtsilä Super", 1000));


    }

    public void sail (){

        System.out.println(manufacturer + " " + this.model + " seilaa merten ääriin!");
    }
    
}
