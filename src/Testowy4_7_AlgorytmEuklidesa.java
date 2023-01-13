public class Testowy4_7_AlgorytmEuklidesa {
    public static void main(String[] args) {

        int a = 123124123;
        int b = 143565786;
        int c = a;
        int d = b;
        double e = a;
        double f = b;
        double reszta = 1.0;

        while (a != b) {


            if (a < b) {

                b -= a;

            } else {

                a -= b;

            }


        }
        System.out.println("wspólny dzielnik liczby " + c + " oraz " + d + " wynosi: " + a);
        System.out.println("Koniec programu 1");
        System.out.println("Start programu 2");


        while (reszta != 0.0) {

            if (e > f) {

                reszta = e % f;
                e = f;
                f = reszta;


            } else {
                double temporary = f;
                f = e;
                e = temporary;

            }

        }
        System.out.println("wspólny dzielnik liczby " + c + " oraz " + d + " wynosi: " + (int) e);
        System.out.println("Koniec programu 2");

    }


}




