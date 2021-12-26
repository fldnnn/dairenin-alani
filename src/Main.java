import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        float a;

        Scanner input = new Scanner(System.in);

        System.out.print("Merkez açı ölçüsünü giriniz a : ");
        a = input.nextFloat();

        System.out.println("Daire yarı çapını giriniz : ");
        r = input.nextInt();

        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        double daireDilimiHesapla = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Dilimi Alani: "+daireDilimiHesapla);
    }
}
