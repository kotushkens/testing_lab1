package task3;

public class AliveException extends NullPointerException{
    public AliveException(boolean who){
        super((who ? "subject " : "object ") + " \"Thing\" class is not presented");
    }
}
