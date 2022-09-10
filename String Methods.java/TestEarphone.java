class TestEarphone {
    public static void main(String [] arge){
       String name = new String ("sony");
       System.out.println(name);

 String [] features = {"IPX4", "Qi Charging 28-Hour Battery Life", "Graphite"};

 Earphone sennheiser = new Earphone ("Sennheiser",'B',2000,"Wireless", features) ;
 sennheiser.print();

 Earphone boat = new Earphone (" BOAT");
 boat.print();
}
   }