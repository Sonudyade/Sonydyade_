class Note {
  String Notename;
  String Subname;
  String color;
  int noOfpage;
  int Rate;

  Note(){
}

  Note(String noten){
  Notename = noten;
}

  Note( String noten, String subn, String col, int noOfp, int rate){
  Notename = noten;
  Subname = subn;
  color = col;
  noOfpage = noOfp;
  Rate = rate;

   }
}
