package chapter9person;

public class InheritanceTester {
    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Sandy");
        System.out.println(mom.getName() + " is a " + mom.getGender());

    }
}
