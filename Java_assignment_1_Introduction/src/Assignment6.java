import java.util.Iterator;

public class Assignment6 {
	public static void main(String[] args) {
		double[] arr = new double[]{10.5, 11.5};
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
