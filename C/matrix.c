#include <stdio.h>
#include <stdlib.h>

int main()
{
	const char *filePath = "..\\input.txt";

	FILE *fptr = fopen(filePath, "r");
	if (fptr == NULL)
	{
		printf("Error opening file");
		return 1;
	}

	int rows, cols, nnz;
	fscanf(fptr, "%d %d %d", &rows, &cols, &nnz);

	int *row_ptr = (int*) calloc((rows + 1) ,sizeof(int));
	int *col_idx = (int*) malloc(nnz* sizeof(int));
	double *values = (double*) malloc(nnz* sizeof(double));

	int r, c;
	double v;

	row_ptr[0] = 0;
	for (int i = 0; i < nnz; i++)
	{
		fscanf(fptr, "%d,%d,%lf", &r, &c, &v);
		col_idx[i] = c;
		values[i] = v;
		row_ptr[r]++;
	}

	for (int i = 1; i <= rows; i++)
		row_ptr[i] += row_ptr[i - 1];

	printf("row_ptr:\n");
	for (int i = 0; i <= rows; i++)
		printf("%d ", row_ptr[i]);

	printf("\ncol_idx:\n");
	for (int i = 0; i < nnz; i++)
		printf("%d ", col_idx[i]);

	printf("\nvals:\n");
	for (int i = 0; i < nnz; i++)
		printf("%.1f ", values[i]);

	fclose(fptr);
	free(row_ptr);
	free(col_idx);
	free(values);

	return 0;
}