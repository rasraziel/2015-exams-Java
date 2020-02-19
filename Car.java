public class Car{

private String model;
private int year;
private int cc;
private int kilometers;

public Car(){}

public Car(String model, int year, int cc, int kilometers){
   this.model = model;
   this.year = year;
   this.cc = cc;
   this.kilometers = kilometers;
}

public void setModel(String model){
   this.model = model;
}

public String getModel(){
   return this.model;
}

public void setYear(int year){
   this.year = year;
}

public int getYear(){
   return this.year;
}

public void setCc(int cc){
   this.cc = cc;
}

public int getCc(){
   return this.cc;
}

public void setKilometers(int kilometers){
   this.kilometers = kilometers;
}

public int getKilometers(){
   return this.kilometers;
}

public int taxCalculation(){
   int tax;
   if (year<1990){
      tax = 50;
   } else {
      tax = 0;
   }
   if(kilometers<5000){
      tax += 100;
   } else if(kilometers>5000&&kilometers<10000){
      tax += 200;
   } else {
      tax += 300;
   }
   return tax;
}

}