public class makePi {

/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
makePi() → [3, 1, 4]
*/
	public int[] makePi() {
		int[] piDigits = {3, 1, 4};
		return piDigits;
	}

	public static void main(String[] args) {
		makePi test = new makePi();
		System.out.println(test.makePi());
	}
}
