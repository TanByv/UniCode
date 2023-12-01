#include <stdio.h>
#include <string.h>

#define MAX_RECORDS 2
#define MAX_NAME_LEN 40
#define MAX_ID_LEN 40
#define MAX_DEPT_LEN 40

// Student record struct
struct Student {
    char name[MAX_NAME_LEN];
    char id[MAX_ID_LEN];
    char dept[MAX_DEPT_LEN];
    float gpa; 
};

// Function prototypes
void readRecord(struct Student* record);
void printRecord(const struct Student* record);
float calcAvgGPA(const struct Student records[], int numRecords);
struct Student* findRecordByID(const struct Student records[], int numRecords, const char* id);
int getNumStudentsInDept(const struct Student records[], int numRecords, const char* dept);

int main() {
    
    struct Student records[MAX_RECORDS];
    int numRecords = 0;
    
    // Read 2 records
    while (numRecords < MAX_RECORDS) {
        readRecord(&records[numRecords++]);
    }
    
    // Print records
    for (int i = 0; i < numRecords; i++) {
        printRecord(&records[i]);
    }
    
    // Calculate and print average GPA
    printf("Average GPA: %.2f\n", calcAvgGPA(records, numRecords));
    
    // Find and print record by ID
    struct Student* record = findRecordByID(records, numRecords, "001-612");
    if (record != NULL) {
        printRecord(record);
    }
    
    // Get and print number of Computer Engineering students
    int numCompEngStudents = getNumStudentsInDept(records, numRecords, "Computer Engineering");
    printf("Number of Computer Engineering students: %d\n", numCompEngStudents);
    
    return 0;
}

// Function definitions
void readRecord(struct Student* record) {
    // Use fgets() to read pieces of record
    // Remove newline character from end
    fgets(record->name, MAX_NAME_LEN, stdin);
    record->name[strcspn(record->name, "\n")] = 0;
    
    fgets(record->id, MAX_ID_LEN, stdin); 
    record->id[strcspn(record->id, "\n")] = 0;

    fgets(record->dept, MAX_DEPT_LEN, stdin);
    record->dept[strcspn(record->dept, "\n")] = 0;
    
    // Use scanf() to read GPA since it is a float
    scanf("%f", &record->gpa); 
    getchar(); // Consume leftover newline
}

void printRecord(const struct Student* record) {
    printf("Name: %s\nID: %s\nDepartment: %s\nGPA: %.2f\n\n", 
           record->name, record->id, record->dept, record->gpa);
}

float calcAvgGPA(const struct Student records[], int numRecords) {
    float total = 0;
    for (int i = 0; i < numRecords; i++) {
        total += records[i].gpa;
    }
    return total / numRecords; 
}

struct Student* findRecordByID(const struct Student records[], int numRecords, const char* id) {
    for (int i = 0; i < numRecords; i++) {
        if (strcmp(records[i].id, id) == 0) {
            return (struct Student*) &records[i]; 
        }
    }
    return NULL;
}

int getNumStudentsInDept(const struct Student records[], int numRecords, const char* dept) {
    int count = 0;
    for (int i = 0; i < numRecords; i++) {
        if (strcmp(records[i].dept, dept) == 0) {
            count++;
        }
    }
    return count;
}