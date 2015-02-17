package messager;

import java.util.Scanner;

public class ConsoleInputStrategy implements Reader{

    public String readln() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    
    
}
