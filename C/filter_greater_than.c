#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARR_SIZE 10

void filter_greater_than(int arr[], int* pivot, int filtered[], int* size) { // Define the actual function

  *size = 0;

  for (int i = 0; i < ARR_SIZE; i++) { // Iterate through the array and count amount of filtered entries
    if (arr[i] > *pivot) {
      filtered[*size] = arr[i];
      (*size)++; 
    }
  }
}

int main() {

  int arr[ARR_SIZE] = {1, 5, 3, 8, 2, 9, 6, 4, 7, 0}; // Define the array

  srand(time(NULL));
  int* pivot = &arr[rand() % ARR_SIZE]; // Randomize the pivot

  printf("Pivot: %d\n", *pivot);

  int filtered[ARR_SIZE]; // Initialize the filtered array
  int f_size = 0;

  filter_greater_than(arr, pivot, filtered, &f_size); // Call the function to populate the filtered array

  printf("Filtered Array: "); // Print the filtered array
  for (int i = 0; i < f_size; i++) {
    printf("%d ", filtered[i]); 
  }
  printf("\n");

  return 0;
}
