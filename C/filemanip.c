#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int col;
    int val;
    struct Node *next;
} Node;

Node* create_node(int col, int val) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->col = col;
    newNode->val = val;
    newNode->next = NULL;
    return newNode;
}

void print(Node** rowPtr, int rows) {
    for (int i = 0; i < rows; i++) {
        printf("\nrow: %d\n", i);
        Node *temp = rowPtr[i];
        while (temp != NULL) {
            printf("col: %d, val: %d\n", temp->col, temp->val);
            temp = temp->next;
        }
    }
}

void tear_down(Node** rowPtr, int rows) {
    for (int i = 0; i < rows; i++) {
        Node *temp = rowPtr[i];
        while (temp != NULL) {
            Node *prev = temp;
            temp = temp->next;
            free(prev);
        }
    }
    free(rowPtr);
}

int main() {
    FILE *file = fopen("matrix.txt", "r");
    if (file == NULL) {
        perror("Unable to open the file.");
        return 1;
    }

    int rows, cols;
    fscanf(file, "%d %d", &rows, &cols);

    Node **rowPtr = (Node**)malloc(rows * sizeof(Node*));
    for (int i = 0; i < rows; i++) {
        rowPtr[i] = NULL;
    }

    int row, col, val;
    while (fscanf(file, "%d %d %d", &row, &col, &val) != EOF) {
        Node* newNode = create_node(col, val);
        newNode->next = rowPtr[row];
        rowPtr[row] = newNode;
    }

    fclose(file);

    print(rowPtr, rows);

    tear_down(rowPtr, rows);

    return 0;
}