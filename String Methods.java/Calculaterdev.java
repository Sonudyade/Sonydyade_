class Calculaterdev {

    String brandName;
    short prise;
    char color;
    String types;
    boolean isSolarpower;

      static int division (int a , int b, int c) {
        int div = a/b/c;
        return div; 
}
       static int division (int a , int b) {
        int total = a/b;
        return total; 
}
     static double division(double x , int y) {
        double avg = x/y;
        return avg; 
}
    public static void main (String [] arge){

 Calculaterdev calculaterdev = new Calculaterdev();
         int a = 95;
         int b = 85;
         int c = 75;
         int result = Calculaterdev.division(a,b,c); 
     System.out.println(result);

         int e =78;
         int f = 98;
         int total = Calculaterdev.division(e,f); 
     System.out.println(total);

         double x = 95.6;
         int y = 85; 
         double avg = Calculaterdev.division(x,y); 
     System.out.println(avg);

}
}
