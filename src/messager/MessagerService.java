package messager;


public class MessagerService {

    private Reader reader;
    private Writer writer;
    
    public MessagerService() {
        
    }

    //contructor with passed arguments
    public MessagerService(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    //Delegate the operation to the lower level classes
    public void message() {
        String line = reader.readln();
        writer.writeln(line);
    }

    //change or enter reader object
    public void setReader(Reader reader) {
        this.reader = reader;
    }

    //change or enter writer object
    public void setWriter(Writer writer) {
        this.writer = writer;
    }
        
}
