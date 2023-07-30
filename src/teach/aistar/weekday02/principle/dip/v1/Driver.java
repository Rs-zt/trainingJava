package teach.aistar.weekday02.principle.dip.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:58
 */
public class Driver {
    public void driver(Car car){
        car.run();
    }
    public void driverfire(FireCar fireCar){
        fireCar.run();
    }

}
class test{
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car();
        driver.driver(car);
    }
}
