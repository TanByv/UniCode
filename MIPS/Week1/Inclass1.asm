addi $t0, $zero, 0      # $t0 = i = 0
la $t1, b               # $t1 = array b
la $t2, c               # $t2 = array c
la $t3, a               # $t3 = array a

lw $s0, 0($t1)          # $s0 = b[i]
lw $s1, 0($t2)          # $s1 = c[i]
add $s2, $s0, $s1       # $s2 = b[i] + c[i]

# Store result in a[i]
sw $s2, 0($t3)          # a[i] = $s2
