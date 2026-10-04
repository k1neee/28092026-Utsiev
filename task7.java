public class task7 {
  public static void main(String[] args) {
    String text = args[0];
    int sum = 0;
    for (int i =0;i<text.length();i++) {
      char a = text.charAt(i);
      if (a=='a'|| a=='A'|| a=='e'|| a=='E'|| a=='i'|| a=='I'|| a=='o'|| a=='O'|| a=='u'|| a=='U') {
        sum+=1;
      }

    }
    System.out.println(sum);
  }
}