import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

//        String name = "Lorenzo";

//        System.out.println("My name is " + name);

        Scanner questions = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = questions.nextLine();

        System.out.println("What is your surname?");
        String surname = questions.nextLine();

        System.out.println("Hi " + name + ", your surname is " + surname + ". :D");

    }
}