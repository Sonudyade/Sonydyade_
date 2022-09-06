
class StringToCharArray {
  public static void main (String[] arge){
  String s1 = "Hello";
  String s2 = s1.replace("e","a");
  System.out.println(s2);
  char[]ch = s1.toCharArray();
  for(int i=0;i<ch.length;i++){
  System.out.print(ch[i]);
}
}}