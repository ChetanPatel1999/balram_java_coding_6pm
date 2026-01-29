package class_and_object;

class Dog {

    private String name;
    private int age;
    private String breed;

    public void setDog(String n, int a, String b) {
        name = n;
        age = a;
        breed = b;
    }

    public void getDog() {
        System.out.println("dog info : ");
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("breed : " + breed);
        System.out.println("-------------------------");
    }
}
