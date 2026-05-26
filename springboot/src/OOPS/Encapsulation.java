package OOPS;

public class Encapsulation {
    private int a;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Encapsulation ob =new Encapsulation();
        ob.setA(10);
        System.out.println(ob.getA());
    }

}
