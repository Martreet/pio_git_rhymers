package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int negative = -1;
	private static final int almostMax = 11;
	private int[] numbers = new int[12];

	private int total = negative;

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == negative;
	}

	public boolean isFull() {
		return total == almostMax;
	}

	protected int peekaboo() {
		if (callCheck())
			return negative;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return negative;
		return numbers[total--];
	}

}
