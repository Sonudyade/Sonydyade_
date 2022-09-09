class Calculater {
    String brandName;
    short prise;
    char color;
    String types;
    boolean isSolarpower;

      static int addition (int a , int b, int c) {
        int sum = a+b+c;
        return sum; 
}
       static int addition (int a , int b) {
        int total = a+b;
        return total; 
}
     static double addition (double x , int y) {
        double avg = x+y;
        return avg; 
}
    public static void main (String [] arge){

 Calculater calculater = new Calculater();
         int a = 95;
         int b = 85;
         int c = 75;
         int result = Calculater.addition(a,b,c); 
     System.out.println(result);

         int e =78;
         int f = 98;
         int total = Calculater.addition(e,f); 
     System.out.println(total);

         double x = 95.6;
         int y = 85; 
         double avg = Calculater.addition(x,y); 
     System.out.println(avg);

}

}
