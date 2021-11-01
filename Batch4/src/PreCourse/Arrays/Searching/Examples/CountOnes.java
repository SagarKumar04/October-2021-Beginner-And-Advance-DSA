package PreCourse.Arrays.Searching.Examples;

public class CountOnes {
    public static void main(String[] args) throws InterruptedException {
        int size = 12;
        int arr[] = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};
        int count = 0;

        if(arr[0] == 1) {
            count = size;
        }
        else if(arr[size - 1] == 0) {
            count = 0;
        }
        else {
            int left = 0, right = size - 1;

            while(left <= right) {
                int middle = (right + left) / 2;

                if(right - left > 0) {
                    if(arr[middle] == 1) {
                        count = count + (right - middle + 1);
                        right = middle - 1;
                    }
                    else {
                        left = middle + 1;
                    }
                }
                else {
                    if(arr[middle] == 1) {
                        count = count + 1;
                    }
                    break;
                }
            }
        }

        System.out.println("Number of 1s: " + count);
    }
}
