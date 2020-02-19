public class MyClass{


   public static void main(String[] args){
      Car car1 = new Car("FIAT", 1985, 1200, 20000);
      Truck truck1 = new Truck("VOLVO", 1989, 1500, 15000, 2, 2, 2000);      
      System.out.println(car1.getModel() +" "+ car1.taxCalculation());
      System.out.println(truck1.getModel() +" "+ truck1.taxCalculation());

   }

}