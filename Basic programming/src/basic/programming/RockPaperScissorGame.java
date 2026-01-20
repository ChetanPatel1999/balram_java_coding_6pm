package basic.programming;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<---Rock Paper Scissor Game--->");
        System.out.print("    enter your choise : ");
        String user = sc.next();
        Random random = new Random();
        int index = random.nextInt(3);
        String arr[] = {"rock", "paper", "scissor"};
        String computer = arr[index];
//        System.out.println(computer);

        if (user.equals(computer)) {
            System.out.println("match is tie!");
        } else if (user.equals("rock")) {
            if (computer.equals("paper")) {
                System.out.println("computer is winner " + computer + " beats " + user);
            } else {
                System.out.println("user is winner " + user + " beats " + computer);
            }
        } else if (user.equals("paper")) {
            if (computer.equals("scissor")) {
                System.out.println("computer is winner " + computer + " beats " + user);

            } else {
                System.out.println("user is winner " + user + " beats " + computer);
            }
        } else if (computer.equals("rock")) {
            System.out.println("computer is winner " + computer + " beats " + user);

        } else {
            System.out.println("user is winner " + user + " beats " + computer);
        }
    }
}
