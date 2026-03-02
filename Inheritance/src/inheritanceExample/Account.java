package inheritanceExample;

public interface Account {

    static final int MAXIMUM_AMOUNT = 50000;

    void OpenAccount();

    void CloseAccount();

    void interest();

    default void hello() {

    }

    static void disp() {

    }
}
