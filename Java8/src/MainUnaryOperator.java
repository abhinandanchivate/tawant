import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainUnaryOperator {

	public static void main(String[] args) {
		Function<Integer, Integer> func = x-> x*2;
		Integer result = func.apply(2);
		System.out.println(result);
		
		UnaryOperator<Integer> operator = x-> x*2;
		result = operator.apply(2);
		System.out.println(result);
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> integers2 = math(integers,x->x*2);
		integers2.forEach(System.out::println);
	}
	
	public static <T> List<T> math(List<T> list , UnaryOperator<T> unaryOperator) {
		
		List<T> result = new ArrayList<T>();
		
		for (T t : list) {
			
			result.add(unaryOperator.apply(t));
		}
		return result;
		
		
		
	}
}
