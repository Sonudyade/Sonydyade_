class Notebook {
   public static void main(String[]arge){


Note n = new Note();
System.out.println(n);
System.out.println(n.Notename+"\t"+n.Subname+"\t"+n.color+"\t"+n.noOfpage+"\t"+n.Rate);


Note n1 = new Note("noten");
System.out.println(n1);
System.out.println(n1.Notename+"\t"+n1.Subname+"\t"+n1.color+"\t"+n1.noOfpage+"\t"+n1.Rate);


Note n2 = new Note("Vijay", "Java", "White", 100, 20);
System.out.println(n2);
System.out.println(n2.Notename+"\t"+n2.Subname+"\t"+n2.color+"\t"+n2.noOfpage+"\t"+n2.Rate);

 }
}