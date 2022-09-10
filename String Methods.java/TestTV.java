class TestTV {
     public static void main (String [] arge ){
            String name = new String ("Sonymax");
            System.out.println(name);
    
            String [] features = {"Direct LED . 16:09"};
            TV sony = new TV("SONY","BRAVIA XR", 'B', (byte)50, 70000, features,"smart","led");
            sony.print();

            TV vi = new TV ("VI");
            vi.print();
 }
}