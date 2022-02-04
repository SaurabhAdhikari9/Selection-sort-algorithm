using System;

namespace selectionSort_csharp
{
    internal class Program
    {
        // an static sort function that takes two parameters:
        // #first: list of numbers, #second: order of sorting (ascending or descending)
        public static void sort(int []array, int order)
        {
            int min;
            for(int i = 0; i < array.Length; i++)
            {
                min = i;
                for(int j = i + 1; j <array.Length; j++)
                {
                    // if sorting in ascending order
                    if(order == 0)
                    {
                        // checks the smaller number between the index min and the index j
                        if (array[min].CompareTo(array[j]) > 0)
                        {
                            // assign min with j
                            min = j;
                        }
                    }
                    // if sorting in descending order
                    else if( order == 1)
                    {
                        // checks the greater number between the index min and the index j
                        if (array[min].CompareTo(array[j]) < 0)
                        {   // assign min with j 
                            min = j;
                        }
                    }
                }
                // swapping the values
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        static void Main(string[] args)
        {
            int[] array = {5,3,2,6,7,4,1};
            sort(array, 1);
            // display the sorted list: 

            Console.ReadLine();
        }
    }
}
