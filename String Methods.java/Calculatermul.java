class Calculatermul {

    String brandName;
    short prise;
    char color;
    String types;
    boolean isSolarpower;

      static int multiplication (int a , int b, int c) {
        int mul = a*b*c;
        return mul; 
}
       static int multiplication (int a , int b) {
        int total = a*b;
        return total; 
}
     static double multiplication (double x , int y) {
        double avg = x*y;
        return avg; 
}
    public static void main (String [] arge){

 Calculatermul calculatermul = new Calculatermul();
         int a = 95;
         int b = 85;
         int c = 75;
         int result = Calculatermul.multiplication(a,b,c); 
     System.out.println(result);

         int e =78;
         int f = 98;
         int total = Calculatermul.multiplication(e,f); 
     System.out.println(total);

         double x = 95.6;
         int y = 85; 
         double avg = Calculatermul.multiplication(x,y); 
     System.out.println(avg);

}
}
