import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("Конвектор температур");
        System.out.println("Введите градусы цельсия");
        double cels = new Scanner(System.in).nextDouble();
        int coof1 = 45;
        double coof2 = 1.8;
        System.out.println(cels + "градусов по цельсию это" + cels * coof2+coof1 + " по Фарингейту");

    }

}
