package inheritanceExample;

class parent {

    public void show() {
        System.out.println("parent show called");
    }
}

class child extends parent {

    public void show() //method override
    {
        System.out.println("child show called");
    }
    
}

public class MethodOverriding {

    public static void main(String[] args) {
        child c1 = new child();
        c1.show();
    }
}
