import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Car_Service {
    public static void addCarToDB(Car car) {
        System.out.println(car.toString());

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_schema", "root", "toor");) {
            Statement statement = connection.createStatement();

            int resultSet1 = statement.executeUpdate("INSERT INTO `car_schema`.`cars`" +
                    "(" +
                    "`brand`," +
                    "`model`," +
                    "`price`," +
                    "`type`," +
                    "`color`)" +
                    "VALUES" +
                    "(" +
                    "'" + car.getBrand() + "' ," +
                    "'" + car.getModel() + "' ," +
                    "'" + car.getPrice() + "' ," +
                    "'" + car.getType() + "' ," +
                    "'" + car.getColor() + "' )");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCarsPriceUsingId(Object[] idAndPrice) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_schema", "root", "toor");){

            Statement statement = connection.createStatement();
            int resultSet1 = statement.executeUpdate("UPDATE `car_schema`.`cars`\n" +
                    "SET\n" +

                    "price = " + (double) idAndPrice[1] + "\n" +

                    "WHERE id = " + (int) idAndPrice[0]);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printAllCarsOrderedByPrice() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_schema", "root", "toor")){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * \n" +
                    "FROM car_schema.cars\n" +
                    "ORDER BY price");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("brand") + " " + resultSet.getString("model") + " " +
                        resultSet.getDouble("price") + " " + resultSet.getString("type") + " " +
                        resultSet.getString("color"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void printNrOfCarsOfEachType() {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_schema", "root", "toor")) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT type,\n" +
                    "COUNT(id)\n" +
                    " FROM car_schema.cars\n" +
                    " GROUP BY type");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
