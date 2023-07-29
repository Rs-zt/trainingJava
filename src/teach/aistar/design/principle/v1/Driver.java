package teach.aistar.design.principle.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 14:12
 */
public class Driver {
    public void driver(Car car){
        car.Run();
    }
    public void driverFire(fireCar cat){
        cat.Run();

    }
}
class DriverTest{
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car();
        driver.driver(car);
    }
}
