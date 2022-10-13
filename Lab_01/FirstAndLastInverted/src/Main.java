public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            String result;
            char first, last;

            if(word.length() > 1)
            {
                first = word.charAt(0);
                last = word.charAt(word.length()-1);
                result = last + word.substring(1, word.length()-1) + first;
                System.out.println(result);
            }
            else
            {
                System.out.println("Stringa corta");
            }


        }
    }
}