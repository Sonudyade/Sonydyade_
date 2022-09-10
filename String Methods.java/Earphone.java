class Earphone {
     String brandName;
     char color;
     int price;
     String typeOfEarphone;
     String [] features;

   
   Earphone( String brandName){
           this.brandName = brandName;
}
   
   Earphone( String brandName,char color, int price, String typeOfEarphone, String [] features){
   
     this.brandName = brandName;
     this.color = color;
     this.price = price;
     this.typeOfEarphone = typeOfEarphone; 
     this.features = features;
}

      void print() {
       System.out.println(brandName+"\t"+  color +"\t"+ price +"\t"+typeOfEarphone);
       if (features != null) {
       for(int i = 0; i< features.length;i++){
          System.out.println(features [i] +"\t");
     }
     System.out.println();
  }
}
  }