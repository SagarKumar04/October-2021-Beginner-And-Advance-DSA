package RevisionSessionNov3;

public class CountNegatives {
    public static void main(String[] args) {
        int arr[] = {-20, -15, -10, -9, -7, -6, -1, 1, 11, 19, 30, 34, 75, 87, 100};
        int length = arr.length;
        int count = 0;

        if(arr[0] >= 0) {
            count = 0;
        }
        else if(arr[length - 1] < 0) {
            count = length;
        }
        else {
            int left = 0, right = length - 1;

            while(left <= right) {
                int middle = left + (right - left) / 2;

                if(right - left > 0) {
                    if(arr[middle] < 0) {
                        count = count + (middle - left + 1);
                        left = middle + 1;
                    }
                    else {
                        right = middle - 1;
                    }
                }
                else {
                    if(arr[middle] < 0) {
                        count = count + 1;
                    }
                    break;
                }
            }
        }

        System.out.println("Number of negative elements: " + count);
    }
}
