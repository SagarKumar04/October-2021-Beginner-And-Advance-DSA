#include <stdio.h> // header file for Standard Input Output
#include <stdlib.h> // header file for Standard Library

int max(int num1, int num2) {
	return (num1 > num2) ? num1 : num2;
}

int main() {
	//Your code here
    int T;
	scanf("%d", &T);

    for(int i = 1; i <= T; i++) {
        int n;
		scanf("%d", &n);

        int current = 0;
        int currentMinusOne = 0;
        int currentMinusTwo = 0;
        for(int j = 1; j <= n; j++) {
            scanf("%d", &current);

            if(j == 1) {

            }
            else if(j == 2) {
                current = max(current, currentMinusOne);
            }
            else {
                current = max(current + currentMinusTwo, currentMinusOne);
            }

            currentMinusTwo = currentMinusOne;
            currentMinusOne = current;
        }

        printf("%d\n", current);

	}

	return 0;
}