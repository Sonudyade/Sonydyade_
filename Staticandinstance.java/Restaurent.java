class Restaurent { 
    static String name = "Athiti";
    static short noOfItem = 300;
    static int cost= 500000;

    String[] owner = {"Mahesh" , "Shiva","Ganesh"}; 
    String manager ;
    boolean isPureVeg ; 
    int noOfEmployee;
    float reviews;
   
    Restaurent(){
 }

Restaurent(String manage,boolean ispurev, int noOfE, float rev){
    manager = manage;
    isPureVeg = ispurev;
    noOfEmployee = noOfE;
    reviews = rev;
   }

public static void main (String[]arge){

  System.out.println(Restaurent.name);
  System.out.println(Restaurent.noOfItem);
  System.out.println(Restaurent.cost);
  
Restaurent restaurent = new Restaurent ();
System.out.println( restaurent.owner[0]); 
System.out.println( restaurent.owner[1]); 
System.out.println( restaurent.owner[2]); 

Restaurent sky =new
Restaurent("Shivanand",true,150,4.5f);

  System.out.println(sky.manager);
  System.out.println(sky.isPureVeg );
  System.out.println(sky.noOfEmployee);
  System.out.println(sky.reviews);
  }
}