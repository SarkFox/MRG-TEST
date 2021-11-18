public class EnteroMasGrande
{
    public static void main(String[] args) throws Exception
    {
       int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
       int max = 0;
       for (int i = 0; i < arr.length;i++)
       {
           if(max < arr[i])
           {
               max = arr[i];
           }
       }
       System.out.print("El entero mas grande del arreglo es: " + max);

    }
}
