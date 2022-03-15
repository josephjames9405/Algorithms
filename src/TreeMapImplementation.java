import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> shirts = new TreeMap<>();
		shirts.put("001", "Blue Shirt");
		shirts.put("003", "Green Shirt");
		shirts.put("002", "White Shirt");

		Set<String> keys = shirts.keySet();
		for (String key : keys)
			System.out.println("Shirt:" + key + "  " + shirts.get(key));

	}

}
