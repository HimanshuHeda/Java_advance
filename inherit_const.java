class base{
    int b;
}

class derived extends base{
    int d;

}

public class inherit_const {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
    }
}
