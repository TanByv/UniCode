#include <stdio.h>

static int equi_cnt = 0, iso_cnt = 0, sca_cnt = 0;

void classify_triangles(float side1, float side2, float side3) {
  if(side1 == side2 && side2 == side3) { // Count the equi triangles
    equi_cnt++; 
  }
  else if(side1 == side2 || side2 == side3 || side1 == side3) { // Count the iso triangles, using else if simplifies the check
    iso_cnt++;
  }
  else { // Count sca triangles, which would be the triangles didn't get caught by the earlier checks
    sca_cnt++; 
  }
  
  int sum = side1 + side2 + side3; // Check if the triangle is small
  if(sum <= 12) {
    printf("You entered a small triangle.\n\n"); 
  }
}

int main() {
  float s1, s2, s3; // Initialize variables
  
  while(1) {
    printf("Enter triangle sides (or -1 -1 -1 to quit): "); // Ask for input
    scanf("%f%f%f", &s1, &s2, &s3);
    if(s1 == -1 && s2 == -1 && s3 == -1) // If input is -1 -1 -1, stop the loop and show the results
      break;
      
    classify_triangles(s1, s2, s3);
  }
  
  printf("\nEquilateral triangles: %d\n", equi_cnt); // Print results
  printf("Isosceles triangles: %d\n", iso_cnt); 
  printf("Scalene triangles: %d\n", sca_cnt);
  
  return 0;
}