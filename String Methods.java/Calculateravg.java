class Calculateravg{

    String brandName;
    short prise;
    char color;
    String types;
    boolean isSolarpower;

      static int average(int a , int b, int c) {
        int sum = (a+b+c)/3;
        return sum; 
}
       static int average (int e , int f) {
        int total = (e+f)/2;
        return total; 
}
     static double average(double x , int y) {
        double avg = (x+y)/2;
        return avg; 
}
    public static void main (String [] arge){

 Calculateravg calculateravg = new Calculateravg();
         int a = 95;
         int b = 85;
         int c = 75;
         int result = Calculateravg.average(a,b,c); 
     System.out.println(result);

         int e =78;
         int f = 98;
         int total = Calculateravg.average(e,f); 
     System.out.println(total);

         double x = 95.6;
         int y = 85; 
         double avg = Calculateravg.average(x,y); 
     System.out.println(avg);

}
}
