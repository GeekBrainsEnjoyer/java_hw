package HW.HW6;

public class Program {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.id = 100;
        c1.name = "Vazy";
        c1.furColor = "red";
        c1.character = "Nice, cute, soft, mimimi, nynyny";

        Cat c2 = new Cat();
        c2.id = 101;
        c2.name = "Marusy";
        c2.furColor = "Black";

        Cat c3 = new Cat();
        c3.id = 101;
        c3.name = "Marusy";
        c3.furColor = "Black";
        

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c2.toString());
        
        System.out.println(c3.equals(c2));

    }
}
