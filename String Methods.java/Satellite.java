class Satellite {
     String Sname;
     short noOfSatellite;
     float Year;
     String [] features;


   
   Satellite( String Sname){
           this.Sname = Sname;
}
   
   Satellite( String Sname, short noOfSatellite,float Year, String [] features){
   
     this.Sname = Sname;
     this.noOfSatellite =noOfSatellite;
     this.Year = Year
     this.features = features;
}

      void print() {
       System.out.println(Sname+"\t"+noOfSatellite +"\t"+ Year);
       if (features != null) {
       for(int i = 0; i< features.length;i++){
          System.out.println(features [i] +"\t");
     }
     System.out.println();
  }
}
  }