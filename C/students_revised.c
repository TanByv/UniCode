#include <stdio.h>
#include <string.h>

#define MAX_LENGTH 40
#define NUM_RECORDS 2

// Function to create a record
void createRecord(char fullNames[NUM_RECORDS][MAX_LENGTH],
                  char ids[NUM_RECORDS][MAX_LENGTH],
                  char departments[NUM_RECORDS][MAX_LENGTH],
                  float gpas[NUM_RECORDS]) {
    for (int i = 0; i < NUM_RECORDS; ++i) {
        printf("Enter Full Name for student %d: ", i + 1);
        fgets(fullNames[i], MAX_LENGTH, stdin);
        fullNames[i][strcspn(fullNames[i], "\n")] = '\0';  // Remove newline character

        printf("Enter ID for student %d: ", i + 1);
        fgets(ids[i], MAX_LENGTH, stdin);
        ids[i][strcspn(ids[i], "\n")] = '\0';

        printf("Enter Department for student %d: ", i + 1);
        fgets(departments[i], MAX_LENGTH, stdin);
        departments[i][strcspn(departments[i], "\n")] = '\0';

        printf("Enter GPA for student %d: ", i + 1);
        scanf("%f", &gpas[i]);

        // Consume the newline character left in the input buffer
        while (getchar() != '\n');
    }
}

// Function to print a record
void printRecord(char fullName[MAX_LENGTH], char id[MAX_LENGTH], char department[MAX_LENGTH], float gpa) {
    printf("Full Name: %s\n", fullName);
    printf("ID: %s\n", id);
    printf("Department: %s\n", department);
    printf("GPA: %.2f\n", gpa);
}

// Function to calculate the average GPA
float calculateGPA(float gpas[NUM_RECORDS]) {
    float totalGPA = 0.0;

    for (int i = 0; i < NUM_RECORDS; ++i) {
        totalGPA += gpas[i];
    }

    return totalGPA / NUM_RECORDS;
}

// Function to find a record by ID
int findById(const char ids[NUM_RECORDS][MAX_LENGTH], const char *targetID, int *foundIndex) {
    for (int i = 0; i < NUM_RECORDS; ++i) {
        if (strcmp(ids[i], targetID) == 0) {
            *foundIndex = i;
            return 1; // Record found
        }
    }

    // Record not found
    return 0;
}

// Function to count the number of students in a given department
int countStudentsInDepartment(const char departments[NUM_RECORDS][MAX_LENGTH], const char *targetDepartment) {
    int count = 0;

    for (int i = 0; i < NUM_RECORDS; ++i) {
        if (strcmp(departments[i], targetDepartment) == 0) {
            count++;
        }
    }

    return count;
}

// Function to change the department of a student given her ID
void changeDepartmentById(char departments[NUM_RECORDS][MAX_LENGTH], char ids[NUM_RECORDS][MAX_LENGTH],
                          const char *targetID, const char *newDepartment) {
    int foundIndex;

    if (findById(ids, targetID, &foundIndex)) {
        // Change the department
        strcpy(departments[foundIndex], newDepartment);
        printf("\nDepartment changed successfully for student with ID %s\n", targetID);
    } else {
        printf("\nStudent with ID %s not found\n", targetID);
    }
}

// Function to calculate the GPA of the students in a given department
float calculateDepartmentGPA(const char departments[NUM_RECORDS][MAX_LENGTH],
                             const float gpas[NUM_RECORDS],
                             const char *targetDepartment) {
    float totalGPA = 0.0;
    int count = 0;

    for (int i = 0; i < NUM_RECORDS; ++i) {
        if (strcmp(departments[i], targetDepartment) == 0) {
            totalGPA += gpas[i];
            count++;
        }
    }

    return (count == 0) ? 0.0 : totalGPA / count;
}

// Function to get the number of students in a given department
int getNumberOfStudentsInDepartment(const char departments[NUM_RECORDS][MAX_LENGTH], const char *targetDepartment) {
    return countStudentsInDepartment(departments, targetDepartment);
}

int main() {
    char fullNames[NUM_RECORDS][MAX_LENGTH];
    char ids[NUM_RECORDS][MAX_LENGTH];
    char departments[NUM_RECORDS][MAX_LENGTH];
    float gpas[NUM_RECORDS];

    // Create records
    createRecord(fullNames, ids, departments, gpas);

    // Print records
    for (int i = 0; i < NUM_RECORDS; ++i) {
        printf("\nDetails for student %d:\n", i + 1);
        printRecord(fullNames[i], ids[i], departments[i], gpas[i]);
    }

    // Calculate and print average GPA
    float averageGPA = calculateGPA(gpas);
    printf("\nAverage GPA of all students: %.2f\n", averageGPA);

    // Find a record by ID
    char targetID[MAX_LENGTH];
    int foundIndex;

    printf("\nEnter the ID to search for: ");
    fgets(targetID, MAX_LENGTH, stdin);
    targetID[strcspn(targetID, "\n")] = '\0';

    if (findById(ids, targetID, &foundIndex)) {
        printf("\nRecord found:\n");
        printRecord(fullNames[foundIndex], ids[foundIndex], departments[foundIndex], gpas[foundIndex]);
    } else {
        printf("\nRecord not found for ID: %s\n", targetID);
    }

    // Count the number of students in Computer Engineering
    char targetDepartment[] = "Computer Engineering";
    int numCompEngStudents = getNumberOfStudentsInDepartment(departments, targetDepartment);
    printf("\nNumber of students in %s: %d\n", targetDepartment, numCompEngStudents);

    // Change the department of a student
    char newDepartment[MAX_LENGTH];
    printf("\nEnter the ID of the student to change the department: ");
    fgets(targetID, MAX_LENGTH, stdin);
    targetID[strcspn(targetID, "\n")] = '\0';

    printf("Enter the new department: ");
    fgets(newDepartment, MAX_LENGTH, stdin);
    newDepartment[strcspn(newDepartment, "\n")] = '\0';

    changeDepartmentById(departments, ids, targetID, newDepartment);

    // Calculate and print the GPA of students in a given department
    printf("\nEnter the department to calculate GPA for: ");
    fgets(targetDepartment, MAX_LENGTH, stdin);
    targetDepartment[strcspn(targetDepartment, "\n")] = '\0';

    float departmentGPA = calculateDepartmentGPA(departments, gpas, targetDepartment);
    printf("\nAverage GPA of students in %s: %.2f\n", targetDepartment, departmentGPA);

	char userDepartment[MAX_LENGTH];
    printf("\nEnter the department to count the number of students: ");
    fgets(userDepartment, MAX_LENGTH, stdin);
    userDepartment[strcspn(userDepartment, "\n")] = '\0';

    int numUserDepartmentStudents = getNumberOfStudentsInDepartment(departments, userDepartment);
    printf("\nNumber of students in %s: %d\n", userDepartment, numUserDepartmentStudents);

    return 0;
}