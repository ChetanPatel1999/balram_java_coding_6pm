/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

public class AccountUser {

    public static void main(String[] args) {
        Account ac1, ac2;
        ac1 = new SavaingAccount();
        ac2 = new CurrentAccount();
        ac1.OpenAccount();
        ac1.CloseAccount();
        ac1.interest();
        ac2.OpenAccount();
        ac2.CloseAccount();
        ac2.interest();
    }
}
