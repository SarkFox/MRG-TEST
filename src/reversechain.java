import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class reversechain
{
    public static void main(String[] args) throws Exception {
        try (
                InputStreamReader is= new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
        )
        {
            System.out.println("Digite la cadena a reversar");
            String line = br.readLine();
            System.out.println("Esta es su linea: " + line);
            char letra;
            String reverse="";

            for (int i =0; i<line.length();i++)
            {
                letra = line.charAt(i);
                reverse = letra+reverse;
            }
            System.out.print("Cadena reversada: " + reverse);
        }
    }

}

