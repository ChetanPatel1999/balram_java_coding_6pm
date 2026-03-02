/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

public class SavaingAccount extends Student implements Account,Interest  {

    public void OpenAccount() {
        System.out.println("your Saving account is open");
    }

    public void CloseAccount() {
        System.out.println("your Saving account is close");
    }

    public void interest() {
        System.out.println("your saving interse is calculate");
    }

    @Override
    public void quateryInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void haflyInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yearlyInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String resultProcessing(int per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
