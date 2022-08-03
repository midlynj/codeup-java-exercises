public class StringExercise {
    public static void main(String[] args) {
        String sentence1 = "We don't need no education\n";
        String sentence2 = "We don't need no thought control\n";
        sentence1 = sentence1 + sentence2;
        System.out.println(sentence1);

        String sentence3 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(sentence3);

        String sentence4 = "In windows, the main drive is usually C:\\";
        System.out.println(sentence4);

        String sentence5 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(sentence5);

    }
}
