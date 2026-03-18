/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

public class CustomeException {

    public static void main(String[] args) {
        int age = 5;

        try {
            if (age < 18) {
                throw new InvalidAgeException("you can not vote");

            } else {
                System.out.println("you can vote");
            }
        }
        catch(InvalidAgeException e)
        {
//            System.out.println(  e.getMessage());
            System.out.println(e.myMsg());
        }

    }
}
