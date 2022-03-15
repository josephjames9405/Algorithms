import java.util.HashMap;

public class SumHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 6, 2, 4, 8, 7 };
		int[] a=indices(input,8);
		for(int i:a)
		{
			System.out.println(i);
		}
	}

	private static int[] indices(int[] input, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++)
		{
			int difference = target-input[i];
			if(map.containsKey(difference))
			{
				return new int[] {map.get(difference),i};
			}
			else
			{
				map.put(input[i], i);
			}
		}
		return new int[] {};
	}
}

