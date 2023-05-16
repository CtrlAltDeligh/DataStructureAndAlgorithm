import javax.swing.JOptionPane;

public class InsertionSort {
    public static void main(String[] args) {
       int size=Integer.parseInt(JOptionPane.showInputDialog("Enter how many elements you want to sort."));
       int arr[]=new int[size];
        for(int x=0;x< arr.length;x++){
            arr[x]=Integer.parseInt(JOptionPane.showInputDialog("Enter elements: "));
        }
        String[] options = {"Ascending", "Descending"};
        int choice = JOptionPane.showOptionDialog(null, "Sort in ascending or descending order?", "Sort Options", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (choice == 0) {
            String unsortedArray = "Unsorted array: ";
            for(int y=0;y< arr.length;y++){
                unsortedArray+=arr[y] + " ";
            }
            insertionSortAsc(arr);
            String resultAsc = "Sorted Array: ";
            for (int i = 0; i < arr.length; i++) {
                resultAsc += arr[i] + " ";
            }
            JOptionPane.showMessageDialog(null, unsortedArray + "\n" + resultAsc, "Ascending", JOptionPane.INFORMATION_MESSAGE);

        } else if (choice == 1) {
            insertionSortDesc(arr);
            String resultDesc = "Sorted Array: ";
            for (int i = 0; i < arr.length; i++) {
                resultDesc += arr[i] + " ";
            }
            String unsortedArray = "Unsorted array: ";
            for(int y=0;y< arr.length;y++){
                unsortedArray+=arr[y] + " ";
            }
            JOptionPane.showMessageDialog(null, unsortedArray + "\n" + resultDesc, "Descending", JOptionPane.INFORMATION_MESSAGE);

        } else {

         return;
        }
    }
    public static void insertionSortAsc(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void insertionSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
