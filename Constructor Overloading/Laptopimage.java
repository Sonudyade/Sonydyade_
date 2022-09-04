class Laptopimage {
    public static void main (String[] arge){


  Laptop l = new Laptop();
  System.out.println(l);
  System.out.println(l.Lapname+"\t"+l.Color+"\t"+l.Brandname+"\t"+l.Rate);


  Laptop l1 = new Laptop("Dell");
  System.out.println(l);
  System.out.println(l1.Lapname+"\t"+l1.Color+"\t"+l1.Brandname+"\t"+l1.Rate);


  Laptop l2 = new Laptop("Dell","Silver","Xps",45000);
  System.out.println(l);
  System.out.println(l2.Lapname+"\t"+l2.Color+"\t"+l2.Brandname+"\t"+l2.Rate);

  }
}