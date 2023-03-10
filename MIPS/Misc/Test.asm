.data
    message: .asciiz "Hello World\n" # Define string to print

.text
    main:
        # Print the message
        li $v0, 4          # Load system call code for print string
        la $a0, message    # Load address of message into $a0
        syscall            # Call the print string system call

        # Exit the program
        li $v0, 10         # Load system call code for exit
        syscall            # Call the exit system call
