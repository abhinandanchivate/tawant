import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		Stream<Integer> integers = Stream.of(1,2,3,4,5,6,7,8,9);
		
		integers.forEach(System.out::println);
		
	}
}
