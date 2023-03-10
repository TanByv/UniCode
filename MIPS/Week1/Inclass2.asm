.data
    # Array with 5 integer values
    a:
        .word 48, 29, 10, 18, 22
    b:
        .word 36, 24, 78, 17, 19
    c:
        .word 1, 2, 3, 4, 5

.text
    main:
        # Load the address of the arrays into registers
        la $t0, a
        la $t1, b
        la $t2, c

        # variable i
        li $t3, 0

    loop:
        # Check if we've reached the end of the arrays
        beq $t3, 5, exit

        lw $t4, 0($t1)
        lw $t5, 0($t2)
        add $t6, $t4, $t5

        # Store result in a[i]
        sw $t6, 0($t0)

        # Print the value of a[i]
        lw $a0, ($t0)
        li $v0, 1
        syscall
        
        # Print a newline
        li $a0, 10
        li $v0, 11
        syscall

        # Increment offsets & counter
        addi $t0, $t0, 4
        addi $t1, $t1, 4
        addi $t2, $t2, 4
        addi $t3, $t3, 1

        j loop

    exit: 
        # Exit program
        li $v0, 10
        syscall