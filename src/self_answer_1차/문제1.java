package self_answer_1차;

class 문제1 {
	public long solution(long num) {
		String answer = Integer.toString((int) num + 1);

		char[] intTo = answer.toCharArray();
		char[] arr = new char[intTo.length];

		for (int i = 0; i < intTo.length; i++) {
			if (intTo[i] == '0') {
				arr[i] = '1';
			} else {
				arr[i] = intTo[i];
			}
		}
		return Integer.parseInt(String.valueOf(arr));
	}

	public static void main(String[] args) {
		문제1 sol = new 문제1();
		long num = 9949999;
		long ret = sol.solution(num);

		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}
