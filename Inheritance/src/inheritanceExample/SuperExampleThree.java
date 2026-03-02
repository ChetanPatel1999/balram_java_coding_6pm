package inheritanceExample;

class employ {

    private int id;
    private String address;

    public employ(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public void getEmploy() {
        System.out.println("id : " + id);
        System.out.println("address : " + address);
    }

}

class developer extends employ {

    private String lang;

    public developer(int id, String address, String lang) {
        super(id, address);
        this.lang = lang;
    }

    public void getDeveloper() {
        getEmploy();
        System.out.println("language : " + lang);
    }

}

public class SuperExampleThree {

    public static void main(String[] args) {
        developer d1 = new developer(1010, "indore", "python");
        d1.getDeveloper();
    }
}
