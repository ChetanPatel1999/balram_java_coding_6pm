package class_and_object;

class Demo {

    int a; //instance variable
    int b;//instance variable
    static int c; // class variable
    static int d; //class variable

    public void setData(int r, int s, int t, int u) {
        a = r;
        b = s;
        c = t;
        d = u;
    }

    public void getData() {
        System.out.println("a,b = " + a + "," + b);
        System.out.println("c,d = " + c + "," + d);
    }
}

public class StaticNonStaticExample {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.setData(12,13,100,200);
        d2.setData(14,15,300,400);
        d3.setData(16,17,500,600);
        
        d1.getData();
        d2.getData();
        d3.getData();
    }
}
