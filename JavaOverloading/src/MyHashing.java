public class MyHashing {
    private int seed = 100;

    public MyHashing(){


    }

    public MyHashing(int seed){
        this.seed = seed;

    }

    public int hash(String str){
        int sum = 0;
        char[] letters= str.toCharArray();
        for (char c: letters){
            sum += c;
        }
        return sum;
    }

    public int hash(int x){
        int temp = seed;
        seed = x;
        return temp;
    }
}
