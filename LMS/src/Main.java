public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Atay", "Senior Developer", "JAVA");

        Dancer dancer = new Dancer("Baisal", "Dancing Shafl","Ala-Too");


        Singer singer = new Singer("Babakhan", "Guitarist","Biz Tobu");
        System.out.println("   ----Persons----");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println();
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println();
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();

    }
}