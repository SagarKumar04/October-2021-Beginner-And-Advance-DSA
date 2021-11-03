package RevisionSessionNov3;

public class KokoEatingBananas {
    static boolean isSpeedEnough(int bananaPile[], int eatingSpeed, int hours) {
        int requiredHours = 0;
        boolean isEnough;

        for(int i = 0; i < bananaPile.length; i++) {
            //if the number of bananas is exactly divisible by the eating speed
            if(bananaPile[i] % eatingSpeed == 0) {
                requiredHours = requiredHours + (bananaPile[i] / eatingSpeed);
            }
            //if the number of bananas is not exactly divisible by the eating speed
            else {
                requiredHours = requiredHours + (bananaPile[i] / eatingSpeed) + 1;
            }
        }

        //if the required hours at a certain speed is less than or equal to number of hours in hand
        if(requiredHours <= hours) {
            isEnough = true;
        }
        //if the required hours at a certain speed is greater than the number of hours in hand
        else {
            isEnough = false;
        }

        return isEnough;
    }

    public static void main(String[] args) {
        int arr[] = {30, 11, 23, 4, 20}; //number of bananas in each pile
        int h = 6; //number of hours Koko has in hand
        int left = 1; //minimum speed
        int right = arr[0];

        //finds the maximum element from the array
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > right) {
                right = arr[i]; //maximum speed
            }
        }

        while(left < right) {
            int middle = left + (right - left) / 2;

            //check if the selected speed is enough or not
            boolean isEnough = isSpeedEnough(arr, middle, h);

            //if selected speed is enough, shorten the range and continue searching for a smaller value
            if(isEnough) {
                right = middle;
            }
            //if selected speed is not enough, shorten the range and continue to search for a larger value
            else {
                left = middle + 1;
            }
        }

        System.out.println("Minimum eating speed: " + right);
    }
}
