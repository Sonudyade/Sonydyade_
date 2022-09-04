class Employdetails {
   public static void main(String[] arge){

   Employ e = new Employ();
   System.out.println(e);
   System.out.println(e.Employname+"\t"+e.Address+"\t"+e.Gender+"\t"+e.Salary+"\t"+e.Age);


   Employ e1 = new Employ("Sony Dyade");
   System.out.println(e1);
   System.out.println(e1.Employname+"\t"+e1.Address+"\t"+e1.Gender+"\t"+e1.Salary+"\t"+e1.Age);

 

   Employ e2 = new Employ("Sony Dyade", "Bidar" , "Female",50000, 23);
   System.out.println(e2);
   System.out.println(e2.Employname+"\t"+e2.Address+"\t"+e2.Gender+"\t"+e2.Salary+"\t"+e2.Age);

  }
}