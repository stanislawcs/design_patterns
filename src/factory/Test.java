package factory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car = factory.create("sport");
        Car car1 = factory.create("truck");

        car.drive();
        car1.drive();
    }
}

interface Car{
    void drive();
}

class SportCar implements Car{
    @Override
    public void drive(){
        System.out.println("Drive sport car");
    }
}

class Truck implements Car{
    @Override
    public void drive(){
        System.out.println("Drive truck");
    }
}

class Factory{

    public Car create(String typeOfCar){
        switch(typeOfCar){
            case "sport" :
                return new SportCar();
            case "truck" :
                return new Truck();
            default :
                return null;
        }
    }
}
