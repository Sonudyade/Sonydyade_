class TV {
   String brandName;
   String modelName;
   char color;
   byte size;
   int prise;
   String [] features;
   String typeOfTV;
   String screenType;
  

  TV(String brandName){
         this.brandName = brandName;
 }

   TV(String brandName, String modelName,char color, byte size ,int prise,  String [] features, String typeOfTV, String screenType){
  
        this.brandName = brandName;
        this.modelName = modelName;
        this.color =   color;
        this.size =  size;
        this.prise = prise;
        this.features = features;
        this.typeOfTV = typeOfTV;
        this.screenType = screenType;
}
  
     void print() {
       System.out.println(brandName+"\t"+ modelName +"\t"+ color +"\t"+ prise +"\t"+typeOfTV+"\t"+screenType );
       if (features != null) {
       for(int i = 0; i< features.length;i++){
          System.out.println(features [i] +"\t");
     }
     System.out.println();
  }
}
  }