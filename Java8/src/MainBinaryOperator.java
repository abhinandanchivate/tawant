import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MainBinaryOperator {

	public static void main(String[] args) {
		
		BiFunction<Integer, Float, Float> func = (x,y)->x+y.floatValue();
		
		Float result = func.apply(10, 20.00f);
		System.out.println(result);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
	}
}
