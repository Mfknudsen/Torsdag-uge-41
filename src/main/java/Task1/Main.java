public class Main {
    public static void main(String[] args){
         Driver driver = new Driver("Mads", 19);
         Car car = new Car("KX", "043", 2010, "Slim");
         car.setDriver(driver);
        System.out.println(car.toString());
         Car car2 = new Car("XM", "034", 2020, "Big");
         car2.setDriver(driver);
        System.out.println(car2.toString());
    }
}
