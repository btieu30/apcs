public class BunnyEars2 {
  public int bunnyEars2 (int bunnies) {
    int ears = 0;
    if (bunnies == 0) {
      return 0;
    }
    if (bunnies % 2 == 0) {
      ears = 3;
    } else {
      ears = 2;
    }
    return ears + bunnyEars2(bunnies - 1);
  }
}
