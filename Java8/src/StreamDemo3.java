import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = ()->new Random().nextInt(100);
		
		
		Stream<Integer> stream = Stream.generate(supplier).parallel();
		
		Optional<Integer> result = stream.limit(20).max((i,j)->i.compareTo(j));
		System.out.println(result.get());
	}
}
