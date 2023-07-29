package teach.aistar.weekday02.day08;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 19:17
 */
public class Dog extends Animal{
    private double loyal;

    public Dog() {
        System.out.println("Dog()...");
    }
    public Dog(String name){
        super(name);
        System.out.println("dog(name)...");
    }

    public Dog(double loyal) {
        this.loyal = loyal;
    }

    public Dog(String name, double loyal) {
        super(name);
        this.loyal = loyal;
    }

    public double getLoyal() {
        return loyal;
    }

    public void setLoyal(double loyal) {
        this.loyal = loyal;
    }

    @Override
    public void spark() {

        System.out.println("汪汪...");
    }
    public void watchdoor(){
        System.out.println("看门.....");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("dog{");
        sb.append("loyal=").append(loyal);
        sb.append('}');
        return sb.toString();
    }
}
