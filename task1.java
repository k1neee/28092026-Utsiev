import java.util.Scanner;

public class task1 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Введи слово: ");
  String slovo = scan.nextLine();
  System.out.println(palid(slovo));
 }

 public static boolean proverka(String a) {
  String b = "";
  for(int i = a.length() - 1; i >= 0; i--) {
   b += a.charAt(i);
  }
  return a.equals(b);
 }

 public static String palid(String a) {
  if(proverka(a)) {
   return "Yes";
  } 
  for(int i = 0; i < a.length(); i++) {
   String delit = a.substring(0, i) + a.substring(i + 1);
   if(proverka(delit)) {
    return "Yes";
   }
  }
  return "No";
 }
}