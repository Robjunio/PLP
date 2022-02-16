#include <stdio.h>


int n;


int main(){
	printf("\nInsira um inteiro: ");
	scanf("%d", &n);
	
	for(int i = 0; i < n; i++){
		printf("%d ", i+1);
	}
	
	return 0;
}
