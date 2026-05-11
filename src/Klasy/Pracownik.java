package Klasy;

public class Pracownik {

    String firstName;
    String lastName;
    String dateOfBirth;
    double seniority;

    String getInfo(){

        return ("Imię: " + firstName + " Nazwisko: " + lastName + " Data urodzenia: "
                + dateOfBirth + " Staż pracy: " + seniority+ " lat");
    }

}
