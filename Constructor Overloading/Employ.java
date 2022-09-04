class Employ {
     String Employname;
     String Address;
     String Gender;
     int Salary;
     int Age;
    

   Employ(){
 }

   Employ(String employn){
   Employname = employn;
  }

  Employ( String employn,String addr, String gen,int sal, int age){
  Employname = employn;
  Address = addr;
  Gender = gen;
  Salary = sal;
  Age = age;
  
  }
}