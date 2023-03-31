.data
# no data needed

.text
main:
    li $a0, 5       # $a0 is going to be our X value, set to 5
    li $a1, 3       # $a1 is going to be our Y value, set to 3
    jal foo         # this should set $ra to here since it's linked jump
    move $a0, $v0   # put the answer in $a0 since it's not used anymore

    # Print the result
    li $v0, 1
    syscall
    
    # Exit program
    li $v0, 10
    syscall

foo:
    # the actual function
    slt $t0, $a1, $a0               # $t0 acts like boolean, 1 if x > y, 0 if y > x
    beq $t0, $zero, wonderland      # if x <= y go to wonderland, if not continue

    # most insane MIPS code ever
    add $v0, $a0, $a0 
    add $v0, $v0, $a0
    jr $ra              # jump back to "jal foo"

wonderland:
    # second most insane MIPS code ever
    add $v0, $a1, $a1
    jr $ra              # jump back to "jal foo"