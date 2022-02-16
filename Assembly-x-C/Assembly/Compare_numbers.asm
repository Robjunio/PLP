section .data                                   ;Data segment
    userMsg db 'Please enter the first number: ' ;Ask the user to enter a number
    lenUserMsg equ $-userMsg                     ;The length of the message
    
    userMsg2 db 'Please enter the second number: '
    lenUserMsg2 equ $-userMsg2
    
    userMsgGreater db 'The first is greater than the second number',0xa
    lenUserMsgGreater equ $-userMsgGreater
    
    userMsgLess db 'The first is less than the second number',0xa
    lenUserMsgLess equ $-userMsgLess
    
    userMsgEqual db 'the numbers are the same',0xa
    lenUserMsgEqual equ $-userMsgEqual
                  

section .bss           ;Uninitialized data
    num1 resb 5
    num2 resb 5
	
section .text          ;Code Segment
   global _start

_greater:
    mov eax, 4
    mov ebx, 1
    mov ecx, userMsgGreater
    mov edx, lenUserMsgGreater
    int 80h
    
    jmp _exit
    
_less:
    mov eax, 4
    mov ebx, 1
    mov ecx, userMsgLess
    mov edx, lenUserMsgLess
    int 80h
    
    jmp _exit
    
_equal:
    mov eax, 4
    mov ebx, 1
    mov ecx, userMsgEqual
    mov edx, lenUserMsgEqual
    int 80h
    
    jmp _exit
    
	
_start:                ;User prompt
    mov eax, 4
    mov ebx, 1
    mov ecx, userMsg
    mov edx, lenUserMsg
    int 80h

    ;Read and store the user input
    mov eax, 3
    mov ebx, 2
    mov ecx, [num1]  
    mov edx, 5          ;5 bytes (numeric, 1 for sign) of that information
    int 80h
   
    mov eax, 4
    mov ebx, 1
    mov ecx, userMsg2
    mov edx, lenUserMsg2
    int 80h
   
    ;Read and store the user input
    mov eax, 3
    mov ebx, 2
    mov ecx, [num2] 
    mov edx, 5          ;5 bytes (numeric, 1 for sign) of that information
    int 80h
   
    mov ecx, [num1]
    cmp ecx, [num2]
    je _equal
    JG _greater
    JL _less
    
_exit:
    mov eax, 1
    mov ebx, 0
    int 80h