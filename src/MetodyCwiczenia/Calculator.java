package MetodyCwiczenia;

public class Calculator {


        Calculator() {
            System.out.println("WYNIKI OPERACJI MATEMTYCZNYCH");
        }

        double dodawanie (double a, double b){
            return a + b;

        }

        double odejmowanie (double a, double b){
            return a - b;
        }

        double mnozenie (double a, double b){
            return a * b;

        }

        double dzielenie (double a, double b){
            return a / b;

        }

        void dodawaniePrint (double result){
            System.out.println("Wynik dodawania to: " + result );
        }
        void odejmowaniePrint (double result){
            System.out.println("Wynik odejmowania to: " + result);
        }

        void mnozeniePrint (double result){
            System.out.println("Wynik mnożenia to: " + result);
        }

        void dzieleniePrint (double result){
            System.out.println("Wynik dzielenia to: " + result);
        }

}
