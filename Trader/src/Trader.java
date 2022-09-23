import java.util.ArrayList;
import java.util.List;

public abstract class Trader {
    private List<Tradable> inventory;
    private List<Tradable> wishlist;
    private double money;
    private boolean bilingual;

    public Trader(double money, List<Tradable> inventory, boolean bothLang){
        this.inventory = inventory;
        this.money = money;
        this.bilingual = bothLang;
        this.wishlist = new ArrayList<Tradable>();
    }

    abstract boolean isHuman();

    public void addToWishList(Tradable item){
        wishlist.add(item);
    }

    public boolean isBilingual(){
        return this.bilingual;
    }

    public List<Tradable> getInventory(){
        return inventory;
    }

    public void addToWishlist(Tradable item){
        this.wishlist.add(item);
    }

    public void addToInventory(Tradable item){
        this.inventory.add(item);
    }

    public void removeFromWishList(Tradable item){
        wishlist.add(item);
    }

    public List<Tradable> getWishlist(){
        return this.wishlist;
    }

    public double getMoney(){
        return money;
    }

    public void takeMoney(double amount){
        this.money -= amount;
    }

    public boolean sellTo(Trader other){
        //check
        double TheyPay;
        double GetPaid;
        if((other.isHuman() && this.isHuman()) || this.bilingual || other.isBilingual()){
            for (Tradable t : this.inventory){

                if (other.getWishlist().contains(t)){

                    if(!other.isHuman()){
                        TheyPay = t.getAlienPrice();
                    }
                    else{
                        TheyPay = t.getHumanPrice();
                    }

                    if(this.isHuman())
                        GetPaid = t.getHumanPrice();
                    else
                        GetPaid = t.getAlienPrice();

                    if (other.getMoney() > TheyPay){
                        other.takeMoney(TheyPay);
                        this.money += GetPaid;

                        other.removeFromWishList(t);
                        this.inventory.remove(t);
                        other.addToInventory(t);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean buyFrom(Trader other){
        return other.sellTo(this);
    }

}