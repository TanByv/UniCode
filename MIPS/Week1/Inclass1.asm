.data
    # Array with 5 integer values
    a:
        .word 48, 29, 10, 18, 22
    b:
        .word 36, 24, 78, 17, 19
    c:
        .word 1, 0, 0, 0, 0	
    str:
    .asciiz "The result is "

.text
    main:
        addi $t0, $zero, 0      # $t0 = i = 0
        la $t1, b               # $t1 = array b
        la $t2, c               # $t2 = array c
        la $t3, a               # $t3 = array a

        lw $s0, 4($t1)          # $s0 = b[i]
        lw $s1, 0($t2)          # $s1 = c[i]
        add $s2, $s0, $s1       # $s2 = b[i] + c[i]

        # Store result in a[i]
        sw $s2, 0($t3)          # a[i] = $s2

        # Print the message
        li $v0, 4      # Load system call code for print string
        la $a0, str    # Load address of message into $a0
        syscall  

        # Print the result
        li $v0, 1
        lw $a0, a
        syscall

    exit:
        # Exit program
        li $v0, 10
        syscall
