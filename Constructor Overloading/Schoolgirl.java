class Schoolgirl {
    public static void main(String []arge){


School s = new School();
System.out.println(s);
System.out.println(s.Schoolname+"\t"+s.Address+"\t"+s.Schoolfees);


School s1 = new School("AKPGHS");
System.out.println(s1);
System.out.println(s1.Schoolname+"\t"+s1.Address+"\t"+s1.Schoolfees);



School s2 = new School("AKPHGHS" ,"Bidar" , 1500);
System.out.println(s2);
System.out.println(s2.Schoolname+"\t"+s2.Address+"\t"+s2.Schoolfees);



}
   }

