#include <stdio.h>

// Tan Bayav - 042201156
static int equi_cnt = 0, iso_cnt = 0, sca_cnt = 0;

void classify_triangles(float side1, float side2, float side3) {
  if(side1 == side2 && side2 == side3) {
    equi_cnt++; 
  }
  else if(side1 == side2 || side2 == side3 || side1 == side3) {
    iso_cnt++;
  }
  else {
    sca_cnt++; 
  }
  
  int sum = side1 + side2 + side3;
  if(sum <= 12) {
    printf("You entered a small triangle.\n\n"); 
  }
}

int main() {
  float s1, s2, s3;
  
  while(1) {
    printf("Enter triangle sides (or -1 -1 -1 to quit): ");
    scanf("%f%f%f", &s1, &s2, &s3);
    if(s1 == -1 && s2 == -1 && s3 == -1)
      break;
      
    classify_triangles(s1, s2, s3);
  }
  
  printf("Equilateral triangles: %d\n", equi_cnt);
  printf("Isosceles triangles: %d\n", iso_cnt); 
  printf("Scalene triangles: %d\n", sca_cnt);
  
  return 0;
}