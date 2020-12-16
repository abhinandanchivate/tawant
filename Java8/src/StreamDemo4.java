import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo4 {

	public static void main(String[] args) {
		IntStream intStream = "12345_abcdefghi678".chars();
		
		intStream.forEach(System.out::println);
		
		Stream<String> stream  = Stream.of("192.168.1.1".split("\\."));
		stream.forEach(System.out::println);
	}
}
