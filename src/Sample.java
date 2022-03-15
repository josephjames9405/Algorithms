
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="abbcdbbaaddddd";
		System.out.println("Output is:");
		String output=duplicate(message);
		System.out.println(output);

	}

	private static String duplicate(String message) {
		// TODO Auto-generated method stub
		int count=1;
		char ch=0;
		String output="";
		for(int i=0;i<message.length()-1;i++)
		{
			ch=message.charAt(i);
			int j=i+1;
			if(ch==message.charAt(j))
			{
				count++;
			}
			else
			{
				if(count==1) {
				output=output+ch;
				}
				else {
					output=output+ch+count;
				}
				count=1;
			}
		}
		output=output+ch+count;
		return output;
	}

}
