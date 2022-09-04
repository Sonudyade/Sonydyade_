class Boxsquare {
   public static void main(String[]arge){


  Box b = new Box();
  System.out.println(b);
  System.out.println(b.Width+"\t"+ b.Height+"\t"+ b.Depth);


  Box b1 = new Box(12);
  System.out.println(b1);
  System.out.println(b1.Width+"\t"+ b1.Height+"\t"+ b1.Depth);


  Box b2 = new Box(12,12,12);
  System.out.println(b2);
  System.out.println(b2.Width+"\t"+ b2.Height+"\t"+ b2.Depth);
}

}