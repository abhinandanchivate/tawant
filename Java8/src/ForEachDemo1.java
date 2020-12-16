import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachDemo1 {

	public void main2(String[] args) {
		List<String> names = Arrays.asList("Abhi","advik","udeep","aarti");
		names.forEach(e->System.out.println(e));
		names.forEach(System.out::println);
		//e->System.out.println(e);
		// refeence to instance method from instance 
		// staticref :: method
		// :: ===> method references
		
	}
	
	public static void main3(String[] args) {
		List<String> names = Arrays.asList("Abhi","advik","udeep","aarti");
		Consumer<String> makeUpperCase = new Consumer<String>() {

			@Override
			public void accept(String e) {
				// TODO Auto-generated method stub
				System.out.println(e.toUpperCase());
				
			}
		};
		
		names.forEach(makeUpperCase);
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		map.forEach((k,v)->{
			System.out.println(k +" "+v);
		});
		
		BiConsumer<String, Integer> action = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String k, Integer v) {
				// TODO Auto-generated method stub
				System.out.println(k.toLowerCase());
				System.out.println(v*v);
			}
		};
		map.forEach(action);
	}
}
