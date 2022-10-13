public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "ciao", "pippo"};

        for (String word : words) {
            String result;
            String firstHalf, secondHalf;

            if(word.length() > 1)
            {
                firstHalf = word.substring(0, word.length()/2);
                secondHalf = word.substring(word.length()/2, word.length());
                result = secondHalf + firstHalf;
                System.out.println(result);
            }
            else
            {
                System.out.println("Stringa corta");
            }
        }
    }
}