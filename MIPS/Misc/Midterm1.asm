.data
epicarray: .word 4, 5, 6, 7
coolarray: .word 1, 2, 3
epiclength: .word 4
coollength: .word 3
msg: .asciiz "Sum of the arrays is: "

.text
main:
    # Set variables
    la $a0, epicarray
    la $a1, coolarray
    lw $a2, epiclength
    lw $a3, coollength

    # Linked jump to addition magic to come back later using $ra
    jal magic

    # Printer go brr
    li $v0, 4
    la $a0, msg
    syscall

    move $a0, $t1   # move the answer
    li $v0, 1
    syscall

    # Exit
    li $v0, 10
    syscall

magic:
    move $s0, $a0   # epicarray
    move $s1, $a1   # coolarray

    ble $a2, $a3, jumpover  # check which array is bigger, if so, jump over next line
    move $a2, $a3           # epicarray is bigger, use it's length

jumpover:
    li $t0, 0   # loop counter
    li $t1, 0   # accumulator

loop:
    beq $t0, $a2, end_loop  # check if we looped enough times, if so, exit the loop

    lw $t2, 0($s0)      # epicarray
    lw $t3, 0($s1)      # coolarray
    addu $t1, $t1, $t2  # accumulate the answer in t1
    addu $t1, $t1, $t3

    addi $s0, $s0, 4    # increment the pointers
    addi $s1, $s1, 4
    addi $t0, $t0, 1

    j loop

end_loop:
    jr $ra          # return to main