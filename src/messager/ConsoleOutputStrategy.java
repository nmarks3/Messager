package messager;

public class ConsoleOutputStrategy implements Writer{

    @Override
    public void writeln(String inputString) {
        
        System.out.println(inputString);
    }
    

    
}
