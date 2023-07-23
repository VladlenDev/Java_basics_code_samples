package Features;

public class SwitchExpressions {

    public static void main(String[] args) {
        //  switch expression
        int choice = 2;

        int x = switch (choice) {
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };

        System.out.println("x = " + x); // x = 2

        //  lambda expression in switch expression
        String day = "TH";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";

            default -> {
                if (day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }
        };

        System.out.println(result); // TTH
    }

}
