class Calculatersub{

    String brandName;
    short prise;
    char color;
    String types;
    boolean isSolarpower;

      static int subtraction (int a , int b, int c) {
        int sum = a-b-c;
        return sum; 
}
       static int subtraction (int a , int b) {
        int total = a-b;
        return total; 
}
     static double subtraction(double x , int y) {
        double avg = x-y;
        return avg; 
}
    public static void main (String [] arge){

 Calculatersub calculatersub = new Calculatersub();
         int a = 95;
         int b = 85;
         int c = 75;
         int result = Calculatersub.subtraction(a,b,c); 
     System.out.println(result);

         int e =78;
         int f = 98;
         int total = Calculatersub.subtraction(e,f); 
     System.out.println(total);

         double x = 95.6;
         int y = 85; 
         double avg = Calculatersub.subtraction(x,y); 
     System.out.println(avg);

}
}
