import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius = ");
        double suhuCelcius = input.nextDouble();

        double suhuReamur = (4.0 / 5.0) * suhuCelcius;

        double suhuFahrenheit = (9.0 / 5.0) * suhuCelcius + 32;

        double suhuKelvin = suhuCelcius + 273.15;

        System.out.println("Suhu dalam reamur : " + suhuReamur);
        System.out.println("Suhu dalam Fahrenheit : " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin" + suhuKelvin);

        input.close();

    }
}
