.data
prompt: .asciiz "Enter 4 integers:\n"
output: .asciiz "Max of the array is: "
array: .word 0:4 # Create an integer array of length 4 and initialize to 0

.text

main:
    li $v0, 4
    la $a0, prompt
    syscall         # Print prompt

    la $t0, array   # Set array address as $t0
    li $t1, 0       # Set loop counter to 0

input_loop:
    li $v0, 5       # System call for reading integer
    syscall         # Read integer into $v0
    sw $v0, ($t0)   # Store integer in current array position

    addi $t0, $t0, 4    # Increment array pointer by 4 bytes
    addi $t1, $t1, 1    # Increment loop counter
    bne $t1, 4, input_loop   # If not at end of array, loop again

    la $t0, array       # Load address of array into $t0 again to reset pointer
    lw $t1, ($t0)       # Load first integer into $t1 because its not used anymore
    addi $t0, $t0, 4    # Increment array pointer by 4 bytes
    li $t2, 1           # Initialize new loop counter to 1

max_loop:
    lw $t3, ($t0)               # Load current array element into $t3
    bge $t3, $t1, update_max    # If current element is greater than max, update max
    
    addi $t0, $t0, 4            # Increment array pointer by 4 bytes
    addi $t2, $t2, 1            # Increment loop counter
    bne $t2, 4, max_loop        # If not at end of array, loop again
    j print_result              # Otherwise, jump to print result

update_max:
    move $t1, $t3           # Update max to current value
    addi $t0, $t0, 4        # Increment array pointer by 4 bytes
    addi $t2, $t2, 1        # Increment loop counter
    bne $t2, 4, max_loop    # If not at end of array, loop again

print_result:
    la $a0, output  # Load address of output string into $a0
    li $v0, 4       # System call for printing string
    syscall         # Print output string

    li $v0, 1       # System call for printing integer
    move $a0, $t1   # Move maximum value into $a0
    syscall         # Print maximum value

    li $v0, 10      # System call for exit
    syscall         # Exit program
