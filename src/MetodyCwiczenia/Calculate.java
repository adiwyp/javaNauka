package MetodyCwiczenia;

public class Calculate {

    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        double result = calc1.dodawanie(5,10);
        calc1.dodawaniePrint(result);

        result = calc1.odejmowanie(10,10);
        calc1.odejmowaniePrint(result);

        result = calc1.mnozenie(2,2);
        calc1.mnozeniePrint(result);

        result = calc1.dzielenie(10,2);
        calc1.dzieleniePrint(result);

    }

}
