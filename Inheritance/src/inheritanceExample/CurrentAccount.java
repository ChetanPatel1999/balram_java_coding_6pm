/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

public class CurrentAccount implements Account {

    public void OpenAccount() {
        System.out.println("your Cuurent account is open");
    }

    public void CloseAccount() {
        System.out.println("your Cuurent account is close");
    }

    public void interest() {
        System.out.println("your Cuurent interse is calculate");
    }
}
