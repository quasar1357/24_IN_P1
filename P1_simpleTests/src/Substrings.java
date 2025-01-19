public class Substrings {

    public static void main(String[] args) {
            printSubStrings("Hallo", 0);
            System.out.println("1234".substring(0, 3));
        }

        public static void printSubStrings(String s, int start){
            System.out.println(s.substring(start, s.length()));
            if(s.length() - start > 1){
                printSubStrings(s, start+1);
            }
        }

}
