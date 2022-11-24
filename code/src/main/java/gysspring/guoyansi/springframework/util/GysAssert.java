package gysspring.guoyansi.springframework.util;

public abstract class GysAssert {
    public static void notNull(Object object,String message){
        if (object==null) {
            throw new IllegalArgumentException(message);
        }
    }
}
