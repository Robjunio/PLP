#include <stdio.h>


int numero_1, numero_2;


int main(){
	printf("Insira o primeiro numero: ");
	scanf("%d", &numero_1);
	
	printf("\nInsira o segundo numero: ");
	scanf("%d", &numero_2);
	
	if (numero_1 > numero_2){
		printf("\n%d", numero_1);
	}
	else if (numero_2 > numero_1){
		printf("\n%d", numero_2);
	} 
	else {
		printf("\nOs numeros são iguais");
	}
	
	return 0;
}
