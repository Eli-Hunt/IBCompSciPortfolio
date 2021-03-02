import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


@SuppressWarnings("WrongPackageStatement")
public class POTWPartA {
    public static void main(String[] args, NamingEnumeration<Object> newData) throws NamingException {
        List<Integer> data = Arrays.asList(2, 4, 1, -2, -4, 1, 0);
        ListIterator<Integer> nextData = data.listIterator();
        int[] newArray = new int[0];
        int counter = 0;
        int sum = 0;
        for (int x = 0; x < 7; x++) {
            int nextInt = nextData.next();
            if (nextInt > 0) {
                newArray[x] = (int) newData.next();
                counter += 1;
                sum = sum + newArray[x];
            }
        }
        System.out.println(sum / counter);
    }
}

