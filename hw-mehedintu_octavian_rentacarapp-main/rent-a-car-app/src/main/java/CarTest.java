import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.Test
    void setBrand() {
        //when
        Car car=new Car();
        //then
        car.setBrand("Skoda");
        //verify
        assertEquals(car.getBrand(),"Skoda");
    }

    @org.junit.jupiter.api.Test
    void setModel() {
        //when
        Car car=new Car();
        //then
        car.setModel("Octavia");
        //verify
        assertEquals(car.getModel(),"Octavia");
    }

    @Test
    void setPrice() {
        //when
        Car car=new Car();
        //then
        car.setPrice(12.12);
        //verify
        assertEquals(car.getPrice(),12.12);
    }

    @Test
    void setType() {
        //when
        Car car=new Car();
        //then
        car.setType(Type.SUV);
        //verify
        assertEquals(car.getType(),Type.SUV);
    }

    @Test
    void setColor() {
        //when
        Car car=new Car();
        //then
        car.setColor("green");
        //verify
        assertEquals(car.getColor(),"green");
    }
}