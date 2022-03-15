public class FizzBuzz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        fizzBuzz(20);

    }

    private static void fizzBuzz(int n)
    {
        for(int i=1;i<=20;i++)
        {
            String temp="";
            if(i%3==0)
                temp="Fizz";
            if(i%5==0)
                temp+="Buzz";
            if(temp!="")
                System.out.println(temp);
            else
                System.out.println(i);
        }
    }

}
