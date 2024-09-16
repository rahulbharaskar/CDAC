package rahul.help.towithown;

// Base class Vehicle1
// vehicle class dusrya class file madhe ahe manun vehicle1 ghetla ahe class name
class Vehicle1 {
    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }

    public void stopEngine() {
        System.out.println("The vehicle's engine is stopping.");
    }
}

// Subclass Car
class Car1 extends Vehicle1 {
    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car's engine turns off smoothly.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle1 {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a button press.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine shuts down quickly.");
    }
}

public class VehicaleDrivar {
    public static void main(String[] args) {
        // car sathi obj banvla ahe
        Vehicle1 car = new Car1();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        System.out.println();

        //  Motorcycle sathi obj banvla ahe
        Vehicle1 motorcycle = new Motorcycle();
        System.out.println("Motorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
