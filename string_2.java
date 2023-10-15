import java.util.*;

public class string_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pradeep");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
        
        // setCharAt
        sb.setCharAt(0, 'k');
        System.out.println(sb);
        sb.setCharAt(0,'P');
        System.out.println(sb);
        
        // insert
        sb.insert(0,'K');
        sb.insert(1,'.');
        sb.insert(1,'.');
        System.out.println(sb);
        // delete
        sb.delete(1,2);
        System.out.println(sb);
    }
}
