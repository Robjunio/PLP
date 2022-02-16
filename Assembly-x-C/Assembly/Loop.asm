section	.text
   global _start        ;must be declared for using gcc
	
_start:	                ;tell linker entry point
    mov eax, 4
    mov ebx, 1
    mov ecx, msg
    mov edx, lenMsg
    int 80h

    ;Read and store the user input
    mov eax, 3
    mov ebx, 2
    mov ecx, num  
    mov edx, 5          ;5 bytes (numeric, 1 for sign) of that information
    int 80h
	
    l1:
        mov eax, 4
        mov ebx, 1
        mov ecx, i
        mov edx, 5
        int 80h  
        
        mov eax, i
        add eax, iMais
        
        mov [i], eax
        
        mov ecx, [i]
        cmp ecx, [num] 
        jle l1
	
   mov eax,1             ;system call number (sys_exit)
   int 0x80              ;call kernel
   
section	.bss
    num resb 1

section .data
    msg db 'Enter N: '
    lenMsg equ $-msg
    
    i db '1'
    iMais db 1