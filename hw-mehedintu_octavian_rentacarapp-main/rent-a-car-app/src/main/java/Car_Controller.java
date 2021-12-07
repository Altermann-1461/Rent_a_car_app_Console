import java.util.Scanner;

public class Car_Controller {

    public static Car addACar(){
        Scanner scanner= new Scanner(System.in);

       String brand="default";
       String model="default";
       double price=0.00;
       Type type=Type.ECONOMY;
       String color="default";
       System.out.println("Please enter the cars brand: ");
       boolean isDataCorrect=false;
       while(!isDataCorrect){
           brand= scanner.nextLine();
           if(brand.length()<=200){
               isDataCorrect=true;
           }else {
               System.out.println("Please make sure that your brand remains under 200 characters!");
               System.out.println("Please enter the cars brand: ");
           }
       }


       System.out.println("Please enter the cars model: ");
        isDataCorrect=false;
        while(!isDataCorrect){
            model= scanner.nextLine();
            if(model.length()<=200){
                isDataCorrect=true;
            }else {
                System.out.println("Please make sure that your model remains under 200 characters!");
                System.out.println("Please enter the cars model: ");
            }
        }

       System.out.println("Please enter the cars price: ");
        isDataCorrect=false;
        while(!isDataCorrect){
            price= scanner.nextDouble();
            scanner.nextLine();
            if(price>=0&&price<=33){
                isDataCorrect=true;
            }else {
                System.out.println("Please make sure that your price is not a negative number as well as  not exceeding 33 euro!");
                System.out.println("Please enter the cars price: ");
            }
        }


       System.out.println("Please enter the cars type: ");
        System.out.println("Press 1 for type: ECONOMY");
        System.out.println("Press 2 for type: STANDARD");
        System.out.println("Press 3 for type: SUV");

        switch (scanner.next()) {
            case "1":
                type=Type.ECONOMY;
                if (price>18)price=18;
                break;
            case "2":
                type=Type.STANDARD;
                if (price>30)price=30;
                break;
            case "3":
                type=Type.SUV;
                if (price>33)price=33;
                break;
        }
        scanner.nextLine();
        System.out.println("Please enter the cars color: ");
        isDataCorrect=false;
        while(!isDataCorrect){
            color= scanner.nextLine();
            if(color.length()<=50){
                isDataCorrect=true;
            }else {
                System.out.println("Please make sure that your color remains under 50 characters!");
                System.out.println("Please enter the cars color: ");
            }
        }
        scanner.close();
        Car car=new Car(brand,model,price,type,color);
        return car;
    }
    public static Object[] getIDOfACarAndNewPrice(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the cars id: ");
        int id=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the cars price: ");
        double price = scanner.nextDouble();
        scanner.close();
        Object[] idAndPrice= {id,price};
        return idAndPrice;
    }

}
