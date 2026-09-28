import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    
    public static void sort(ArrayList<Student> list, Comparator<Student> comparator) {
        
        int n = list.size();

        //Loop through the entire list
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            //Search for the smallest element in the unsorted 
            //portion of the list
            for (int j = i + 1; j < n; j++) {

                //Use the comparator to compare the two Student objects
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {

                    minIndex = j;
                }
            }

            //Swap the found minimum element with the first element
            if (minIndex != i) {

                Student temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
