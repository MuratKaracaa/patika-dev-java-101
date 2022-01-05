import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add( 0L );
        list.add( 1L );

        int limit = 50;

        for (int i = 2;i<=limit;i++){
            list.add( list.get( i -1 ) + list.get( i-2 ) );
        }
        System.out.println(list);
    }
}
