class Medical {

   String place;
   String medicine;
   int cost;



   Medical() {
      System.out.println("inside constructor");
 }

  static void showTabletssandTonics(){
    System.out.println("Dolo and Cofsils");

  String msgs = " good-morning-to-all";
  String [] msg = msgs.split("-");

  for (int i=0;i<msg.length;i++){
  System.out.println(msg[i]);

}
}

  public static void main(String[] arge){

  Medical medical = new Medical();
 Medical.showTabletssandTonics();

}
}

