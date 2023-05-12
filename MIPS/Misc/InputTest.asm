.data
prompt1: .asciiz "Enter the first number: "
prompt2: .asciiz "Enter the second number: "
result: .asciiz "The sum is: "

.text
main:
    # print first prompt
    li $v0, 4
    la $a0, prompt1
    syscall

    # read first number
    li $v0, 5
    syscall
    move $t0, $v0

    # print second prompt
    li $v0, 4
    la $a0, prompt2
    syscall

    # read second number
    li $v0, 5
    syscall
    move $t1, $v0

    # calculate sum and store in $t2
    add $t2, $t0, $t1

    # print result message
    li $v0, 4
    la $a0, result
    syscall

    # print sum
    li $v0, 1
    move $a0, $t2
    syscall

    # exit program
    li $v0, 10
    syscall
