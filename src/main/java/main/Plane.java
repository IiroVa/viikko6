package main;

public class Plane extends Vehicle{



    public Plane(String manufacturer, String model, int maxSpeed){

        super("Lentokone", manufacturer, model, maxSpeed);
        engines.add(new Engine("Suihkumoottori", 500));



    }

    public void fly (){

        System.out.println(manufacturer + " " + this.model + " lentää kohteeseen!");

    }
    
}
