/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayExamples;

public class Employ {

    String name;
    int id;

    void setEmploy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void getEmploy() {
        System.out.println("emp info : ");
        System.out.println("emp name : " + name);
        System.out.println("emp id : " + id);
        System.out.println("--------------");
    }

}
