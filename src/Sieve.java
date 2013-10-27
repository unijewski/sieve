import java.util.Arrays;

public class Sieve {

	boolean array [];
	
	public Sieve(int size) {
		int n = size;
		array = new boolean[n+1];
		Arrays.fill(array, true);
		checkIfPrime();
	}

	public boolean returnValue(int value) {
		return array[value];
	}
	
	public void checkIfPrime() {
		for(int i = 2; i*i <= array.length; i++) {
			if(array[i] == false) {
				continue;
			}
			for(int j = 2 * i; j <= array.length; j += i) {
				array[j] = false;
			}
		}
	}
	
}
