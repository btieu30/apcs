import java.util.Arrays;
public class arrayPractice {

public static void main(String[] args) {
  int[] a = new int[] {2, 1, 2, 3, 4};
  int[] b = new int[] {2, 2, 0};
  int[] c = new int[] {1, 3, 5};
  System.out.println(countEvens(a));
  System.out.println(countEvens(b));
  System.out.println(countEvens(c));

  int[] d = new int[] {2, 3, 2, 2, 4, 2};
  int[] e = new int[] {2, 3, 2, 2, 4, 2, 2};
  int[] f = new int[] {1, 2, 3, 4};
  System.out.println(sum28(d));
  System.out.println(sum28(e));
  System.out.println(sum28(f));

  int[] x = new int[] {1, 3, 4};
  int[] y = new int[] {1, 3, 2};
  int[] z = new int[] {1, 1, 4};
  System.out.println(scoresIncreasing(x));
  System.out.println(scoresIncreasing(y));
  System.out.println(scoresIncreasing(z));
}

public static int countEvens(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0)
      count = count + 1;
    }
      return (count);
  }

public static boolean sum28 (int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2)
      count = count + 1;
    }
  if (count * 2 == 8) {
    return true;
  } else {
    return false;
  }
}

public static boolean scoresIncreasing (int[] scores) {
  boolean value = true;
  for (int i = 0; i < scores.length - 1; i++) {
    if (scores[i] > scores[i + 1])
      value = false;
    }
    return value;
}

}
