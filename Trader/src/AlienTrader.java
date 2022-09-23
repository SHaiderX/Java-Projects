import java.util.ArrayList;
import java.util.List;

class AlienTrader extends Trader{

    private List<Tradable> inventory;
    private List<Tradable> wishlist;
    private double money;
    private boolean bilingual;

    public AlienTrader(double money, List<Tradable> inventory, boolean billingual){
        super(money, inventory, billingual);
    }

    public boolean isHuman(){
        return false;
    }
}