package inheritanceExample;

public class MediStd extends Student {

    private int prof;
    private String speci;

    public void setMediStd(int prof, String speci) {
        this.prof = prof;
        this.speci = speci;
    }

    public void getMediStd() {
        System.out.println("medical Student Info : ");
        getStudent();
        System.out.println("prof : " + prof);
        System.out.println("speci : " + speci);
        System.out.println("----------------------");
    }

    String resultProcessing(int per) {
        return per >= 50 ? "pass" : "fail";
    }
}
