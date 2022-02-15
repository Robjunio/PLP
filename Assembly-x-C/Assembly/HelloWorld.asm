; hello_world


section .text:
  global _start

_start:
  mov eax, 4              ; use to write call
  mov ebx, 1              ; use stdout as the fd
  mov ecx, message        ; use the message as the buffer
  mov edx, message_length ; and supply the length
  
  ; exit call
  int 80h                 ; invoke syscall
  mov eax, 0x1
  mov ebx, 0
  int 80h

section .data:
  message:        db "Hello World!", 0xA
  message_length: equ $-message