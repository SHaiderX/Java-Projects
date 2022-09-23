public interface Vehicle {

    void speedUp();

    void speedDown();

    int getSpeed();
}

class Sedan implements Vehicle, Tradable{
    private double humanPrice;
    private int speed;

    public Sedan(double price){
        humanPrice = price;
        speed = 0;
    }

    public void speedUp(){
        this.speed += 2;
    }

    public void speedDown(){
        this.speed -= 2;
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getHumanPrice(){
        return this.humanPrice;
    }

    public double getAlienPrice(){
        return this.humanPrice * 50;
    }
}

class Motorcycle implements Vehicle, Tradable{
    private double humanPrice;
    private double alienPrice;
    private int speed;

    public Motorcycle(double humanPrice, double alienPrice){
        this.humanPrice = humanPrice;
        this.alienPrice = alienPrice;
        speed = 0;
    }

    public void speedUp(){
        this.speed += 1;
    }

    public void speedDown(){
        this.speed -= 1;
    }

    public int getSpeed(){
        return this.speed;
    }

    public double getHumanPrice(){
        return this.humanPrice;
    }

    public double getAlienPrice(){
        return this.alienPrice;
    }
}