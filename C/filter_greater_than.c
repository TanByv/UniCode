#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARR_SIZE 10

// Tan Bayav - 042201156
void filter_greater_than(int arr[], int* pivot, int filtered[], int* size) {

  *size = 0;

  for (int i = 0; i < ARR_SIZE; i++) {
    if (arr[i] > *pivot) {
      filtered[*size] = arr[i];
      (*size)++; 
    }
  }
}

int main() {

  int arr[ARR_SIZE] = {1, 5, 3, 8, 2, 9, 6, 4, 7, 0};

  srand(time(NULL));
  int* pivot = &arr[rand() % ARR_SIZE];

  printf("Pivot: %d\n", *pivot);

  int filtered[ARR_SIZE];
  int f_size = 0;

  filter_greater_than(arr, pivot, filtered, &f_size);

  printf("Filtered Array: ");
  for (int i = 0; i < f_size; i++) {
    printf("%d ", filtered[i]); 
  }
  printf("\n");

  return 0;
}
