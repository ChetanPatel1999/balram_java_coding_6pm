package class_and_object;

public class Team {
    
    int x;
    int y;
    
    public Team(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    void display() {
        System.out.println("x,y = " + x + "," + y);
    }
    
    boolean equals(Team obj) {
        if (x == obj.x && y == obj.y) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {

//        String s1 = new String("indore");
//        String s2 = new String("indore");
//        
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
        String s1 = "indore";
        String s2 = "indore";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        Team t1 = new Team(12, 5);
//        Team t2 = new Team(70, 5);
//        System.out.println(t1.equals(t2));
//        if(t1==t2)
//        {
//            System.out.println("object data are same");
//        }
//        else
//        {
//            System.out.println("object data are difference");
//        }
//        Team t3 = t1;
//        System.out.println(t1 == t3);//True
//        System.out.println(t1 == t2);//false
    }
}
