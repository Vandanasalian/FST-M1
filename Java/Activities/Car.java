package Activities;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
     Car(){
        tyres=4;
        doors=4;

    }
    public void displayCharacteristics(){
        System.out.println("The Color of the car is:" +color );
        System.out.println("Transmission is:" + transmission);
        System.out.println("The Car is made in:" +make);
        System.out.println("Car has "+tyres + " tyres");
        System.out.println("Car has "+doors + " doors");

    }
    public void accelarate(){
        System.out.println("The Car is moving forward");
    }

    public void brake(){
        System.out.println("The Car has stopped");
    }
}
