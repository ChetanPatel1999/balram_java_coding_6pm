/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

public class EngStd extends Student {

    private int sem;
    private String branch;

    public void setEng(int sem, String branch) {
        this.sem = sem;
        this.branch = branch;
    }

    void getEng() {
        System.out.println("Enginering Student Info : ");
        getStudent();
        System.out.println("branch : " + branch);
        System.out.println("sem : " + sem);
        System.out.println("----------------------");
    }

    public String toString() {
        return "EngStd{" + "sem=" + sem + ", branch=" + branch + '}';
    }

    String resultProcessing(int per) {
        return per >= 27 ? "pass" : "fail";
    }

}
