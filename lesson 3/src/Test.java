import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        System.out.println("конвектор валют");
        System.out.println( "Введите колличество рублей");
        double rub = new Scanner(System.in).nextDouble();
        System.out.println( "Введите курс доллара");
        double doll = new Scanner(System.in).nextDouble();
        System.out.println( "Введите курс евро");
        double evr = new Scanner(System.in).nextDouble();

System.out.println(rub + "рублей это" + (rub / evr)+" евро");
System.out.println(rub + "рублей это" + (rub/doll)+" доллар");

    }
}
