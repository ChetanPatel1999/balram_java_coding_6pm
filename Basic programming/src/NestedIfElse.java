
public class NestedIfElse {

    public static void main(String[] args) {
        //wap to print greates number among three number without and operator.
        int n1 = 1256, n2 = 788, n3 = 90;
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("greatest num : " + n1);
            } else {
                System.out.println("greatest num : " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("greatest num : " + n2);
        } else {
            System.out.println("greatest num : " + n3);
        }
    }
}
