public interface AlienAnimal {

    String sound();
}

class Pikachu implements AlienAnimal, Tradable{

    private double humanPrice;
    private double alienPrice;

    public Pikachu(double alienPrice, double humanPrice){
        this.humanPrice = humanPrice;
        this.alienPrice = alienPrice;
    }

    public String sound(){
        return "pika pika";
    }

    public double getHumanPrice(){
        return humanPrice;
    }

    public double getAlienPrice(){
        return alienPrice;
    }
}

class Momo implements AlienAnimal, Tradable{

    private double alienPrice;

    public Momo(double alienPrice){
        this.alienPrice = alienPrice;
    }

    public String sound(){
        return "momo momo";
    }
    public double getHumanPrice(){
        return this.alienPrice/100;
    }

    public double getAlienPrice(){
        return this.alienPrice;
    }
}

class Zealot implements AlienAnimal{

    public String sound(){
        return "En Taro Adun";
    }

}