package teach.aistar.design.principle.v2;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 14:17
 */
public class DriverM {
    public void driver(Vehicle v){
        v.run();
    }
}
class Test{
    public static void main(String[] args) {

        DriverM driverM = new DriverM();
        Car car = new Car();
        driverM.driver(car);
    }
}