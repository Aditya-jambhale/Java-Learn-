#include <stdio.h>

void quicksort(int num[], int first, int last) {
    if (first < last) {
        int pivot = first;
        int p = first + 1;
        int q = last;
        while (p <= q) {
            while (p <= last && num[p] <= num[pivot])
                p++;
            while (num[q] > num[pivot])
                q--;
            if (p < q) {
                int temp = num[p];
                num[p] = num[q];
                num[q] = temp;
            }
        }
        int temp = num[pivot];
        num[pivot] = num[q];
        num[q] = temp;
        quicksort(num, first, q - 1);
        quicksort(num, q + 1, last);
    }
}

int main() {
    int count, num[25];
    printf("Enter the number of elements: ");
    scanf("%d", &count);
    printf("Enter %d elements: ", count);
    for (int i = 0; i < count; i++)
        scanf("%d", &num[i]);
    quicksort(num, 0, count - 1);
    printf("Order of numbers in sorted form: ");
    for (int i = 0; i < count; i++)
        printf("%d ", num[i]);
    return 0;
}
