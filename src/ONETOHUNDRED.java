import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ONETOHUNDRED {
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i < 101;i++)
        {
            if (i%3 == 0 && i%5 ==0 )
            {
                System.out.print("mareigua, ");
            }
            else if(i%3 ==0)
            {
                System.out.print("mare, ");

            }
            else if(i%5 == 0)
            {
                System.out.print("igua, ");
            }
            else{
                System.out.print(i + ", " );
            }
        }

    }

}