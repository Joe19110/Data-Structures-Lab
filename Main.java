public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car("Lambo", 1997, 250, 9);
        System.out.println(car1.serialId);
        car1.sound();
        car1.describe();

        Car car2 = new Car();
        car2.describe();
    }
}

class Car{
    public String name;
    public int yearOfMake;
    public int maxSpeed;
    public int serialId;
    public int currentSpeed;

    public Car(String name, int yearOfMake, int maxSpeed, int serialId){
        this.name = name;
        this.yearOfMake = yearOfMake;
        this.maxSpeed = maxSpeed;
        this.serialId = serialId;
        this.currentSpeed = 0;
    }

    public Car(){
        this.name = "none";
        this.yearOfMake = 0;
        this.maxSpeed = 0;
        this.serialId = 0;
        this.currentSpeed = 0;
    }

    public void sound(){
        System.out.println("Honk Honk");
    }

    public void drive(){
        if (this.currentSpeed <= this.maxSpeed)
            this.currentSpeed += 5;
    }

    public void brake(){
        if (this.currentSpeed >= 0)
            this.currentSpeed -= 5;
    }

    public void describe(){
        System.out.println("Serial ID:" + this.serialId);
        System.out.println("Name:" + this.name);
        System.out.println("Year of Make:" + this.yearOfMake);
        System.out.println("Max Speed:" + this.maxSpeed);
    }
}