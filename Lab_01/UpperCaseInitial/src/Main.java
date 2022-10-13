public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            String result = "";
            String firstChar;
            if(word.length() > 0)
            {
                firstChar = word.substring(0, 1).toUpperCase();
                result = firstChar + word.substring(1);
            }
            System.out.println(result);
        }
    }
}