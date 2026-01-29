package class_and_object;

public class DogUser {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.setDog("jerry", 6, "bull-dog");
        d2.setDog("tiger", 15, "husky");
        d3.setDog("shadow", 21, "human-being");

        d1.getDog();
        d2.getDog();
        d3.getDog();
//        d1.name = "jerry";
//        d1.age = 6;
//        d1.breed = "bull-dog";
//
//        System.out.println("name = " + d1.name);
//        System.out.println("age = " + d1.age);
//        System.out.println("breed = " + d1.breed);
    }
}
