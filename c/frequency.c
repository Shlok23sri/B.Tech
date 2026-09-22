#include <stdio.h>
    // Count the frequency of element in array.
int main() {
    int arr[100], n, i, ele, fre = 0;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to find frequency: ");
    scanf("%d", &ele);

    for (i = 0; i < n; i++) {
        if (arr[i] == ele) {
            fre++;
        }
    }

    printf("Frequency of element %d is: %d\n", ele, fre);

    return 0;
}