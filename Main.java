class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine= true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car represent-> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Ferrari extends Car{
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
class McLaren extends Car{
    public McLaren(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "McLaren -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "McLaren -> accelerate()";
    }

    @Override
    public String brake() {
        return "McLaren -> brake()";
    }
}

class Chevrolet extends Car{
    public Chevrolet(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Chevrolet -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Chevrolet -> accelerate()";
    }

    @Override
    public String brake() {
        return "Chevrolet -> brake()";
    }
}
public class Main {

    public static void main(String[] args) {
	Car car = new Car(8,"Base car");

	System.out.println(car.startEngine());
	System.out.println(car.accelerate());
	System.out.println(car.brake());

    Ferrari ferrari = new Ferrari(8,"Ferrari 488");
    System.out.println(ferrari.startEngine());
    System.out.println(ferrari.accelerate());
    System.out.println(ferrari.brake());


    McLaren mclaren = new McLaren(8,"McLaren 720s");
    System.out.println(mclaren.startEngine());
    System.out.println(mclaren.accelerate());
    System.out.println(mclaren.brake());

    Chevrolet chevrolet = new Chevrolet(8,"Corvette Stingray");
    System.out.println(chevrolet.startEngine());
    System.out.println(chevrolet.accelerate());
    System.out.println(chevrolet.brake());

}


}



