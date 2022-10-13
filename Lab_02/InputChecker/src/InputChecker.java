import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {
        switch (input)
        {
            case "OK": case "S": case "SI": case "certo": case "perché no?":
                return "OK";
            case "N": case "NO":
                return "Fine";
            default:
                return "Dato non corretto";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}