public class One {

    int value = 2;

    public void fun(One one) {
        System.out.println(one.getValue());
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Tree t = new Tree();

        One o = new One();
        One num = new Two();
        Two arg = new Two();

        //System.out.println(t.CheckTwo(o));
        //num.fun(arg);

        int a = 2;
        int b = 2;
        Integer w = new Integer(2);
        Integer x = new Integer(2);
        Integer y = x;
        Integer z = new Integer(w);

    }
}
