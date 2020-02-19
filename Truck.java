
public class Truck extends Car{

private int width, length, weight;

public Truck(){}

public Truck(String model, int year, int cc, int kilometers, int width, int length, int weight){
   super(model,year,cc,kilometers);
   this.width = width;
   this.length = length;
   this.weight = weight;
}

public void setWidth(int width){
   this.width = width;
}

public int getWidth(){
   return this.width;
}

public void setLength(int length){
   this.length = length;
}

public int getLength(){
   return this.length;
}

public void setWeight(int weight){
   this.weight = weight;
}

public int getWeight(){
   return this.weight;
}

@Override
public int taxCalculation(){
   int extra = 0, tax = super.taxCalculation();
   if (weight<1000) extra = 50;
   if (weight>1000) extra = 100;
   return tax+extra; }


}