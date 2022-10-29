public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println(Character.isLetter('S'));

        //task 2
        char emoji1 = '\u2639';
        String emoji2 = "\uD83D\uDE16";
        String emoji3 = "\ud83d\ude0d";
        System.out.println("3 Смайлика:  " + emoji1 + "  " +emoji2 + "  " + emoji3 );

        //task3
        String str1 = "Java";
        String str2 = "C++";

        System.out.println("str1 = "+ str1+ " str2 = "+str2);
        System.out.println("str1 == str2 -> "+ str1.compareTo(str2));
        System.out.println("str2 == str1 -> "+ str2.compareTo(str1));

        StringBuffer sb = new StringBuffer("Hello world");

        sb.replace(6,7,"W");
        System.out.println(sb);
    }
}
