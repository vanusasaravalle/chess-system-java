package boardgame;

public class BoardExcepetion extends RuntimeException {

    private static final long serislVersionUIN = 1L;

    public BoardExcepetion(String msg){
        super(msg);
    }


}
