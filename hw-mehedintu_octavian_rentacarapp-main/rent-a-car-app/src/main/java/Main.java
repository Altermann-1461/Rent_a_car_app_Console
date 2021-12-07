
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to RENT_A_CAR_APP");

        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("The application  provides implementation for the following use cases:");
        System.out.println();
        System.out.println("To add a car – allows a user to add a new car in the database, press: ...............................1");
        System.out.println("To update the price of a car, press: ................................................................2");
        System.out.println("To retrieve the list of all cars press:............................................................. 3");
        System.out.println("To retrieve the list of all car types and the number of cars for each type from the database. press: 4");
        System.out.println("To quit press: 5");
        System.out.println();

        switch (keyboard.next()) {
            case "1":
                Car_Service.addCarToDB(Car_Controller.addACar());
                break;
            case "2":
                Car_Service.updateCarsPriceUsingId(Car_Controller.getIDOfACarAndNewPrice());
                break;
            case "3":
                Car_Service.printAllCarsOrderedByPrice();
                break;
            case "4":
                Car_Service.printNrOfCarsOfEachType();
                break;
            case "5":

                break;
            default:
                break;
        }
        keyboard.close();

    }
}
