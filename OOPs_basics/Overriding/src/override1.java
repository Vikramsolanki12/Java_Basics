class Plane{
    public void takeOff(){
        System.out.println("plaen takeoff...");
    }
    public void fly(){
        System.out.println("plane is flying...");
    }
    public void land(){
        System.out.println("plane is landing...");
    }
}
class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passenger plane takeoff...");
    }
    public void fly(){
        System.out.println("Passenger plane is flying...");
    }
    public void land(){
        System.out.println("Passenger plane is landing...");
    }
}
class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo plane takeoff...");
    }
    public void fly(){
        System.out.println("Cargo plane is flying...");
    }
    public void land(){
        System.out.println("Cargo plane is landing...");
    }
}
class FighterPlane extends Plane{
    public void takeOff(){
        System.out.println("Fighter Plane takeoff...");
    }
    public void fly(){
        System.out.println("Fighter plane is flying...");
    }
    public void land(){
        System.out.println("Fighter plane is landing...");
    }
}
class Airport{
    public void allowPlane(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class override1 {
    public static void main(String[] args) {
        PassengerPlane p = new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);
    }
}
