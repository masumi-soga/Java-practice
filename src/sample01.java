import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sample01 {

  public static void main(String[] args) {
    Integer[] array = new Integer[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    Arrays.sort(array, Collections.reverseOrder());
    for (int j = 0; j < array.length; j++) {
      if (j == 0) {
        System.out.print(array[j]);
      } else
        System.out.print("," + array[j]);
    }

  }
}
