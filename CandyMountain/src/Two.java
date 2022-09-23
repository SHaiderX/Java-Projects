public class Two extends One {

    int value = 3;
    boolean hasSap = false;


    boolean getHasSap(){
        return hasSap;
    }

    void fun(Two two) {
        System.out.println(two.getValue());
    }
}