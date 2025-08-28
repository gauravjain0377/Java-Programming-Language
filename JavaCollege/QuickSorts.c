#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void quicksort(int number[], int first, int last) {
    int i, j, pivot, temp;

    if (first < last) {
        pivot = first;
        i = first;
        j = last;

        while (i < j) {
            while (number[i] <= number[pivot] && i < last)
                i++;
            while (number[j] > number[pivot])
                j--;
            if (i < j) {
                temp = number[i];
                number[i] = number[j];
                number[j] = temp;
            }
        }

        temp = number[pivot];
    number[pivot] = number[j];
        number[j] = temp;

           quicksort(number, first, j - 1);
        quicksort(number, j + 1, last);
    }
}

int main() {
    int number[1000], n = 1000, i;

    srand(time(NULL));

    for (i = 0; i < n; i++)
               number[i] = rand() % 10000;
 clock_t start = clock();

         quicksort(number, 0, n - 1);
    clock_t end = clock();

    double time_taken = (double)(end - start) / CLOCKS_PER_SEC;

    printf("Sorted elements:\n");
    for (i = 0; i < n; i++)
        printf("%d ", number[i]);

    printf("\n\nTime taken to sort %d elements: %f seconds\n", n, time_taken);

    return 0;
}
