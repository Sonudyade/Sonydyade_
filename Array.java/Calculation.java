class Calculation {

  int [] calculation = new int [11];
  

 Calculation(){
 calculation [0] = 5;
 calculation [1] = 8;
 calculation [2] = 45;
 calculation [3] = 55;
 calculation [4] = 34;
 calculation [5] = 59;
 calculation [6] = 98;
 calculation [7] = 89;
 calculation [8] = 4;
 calculation [9] = 87;

 }

 public static void main (String [] arge){

  Calculation c =new Calculation();
  
  for (int i=0; i<c.calculation.length; i++){

  System.out.println(c.calculation[i]);

}
}
}