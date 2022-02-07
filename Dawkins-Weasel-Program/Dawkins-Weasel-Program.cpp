#include <stdio.h>  
#include <stdlib.h>  // Call rand()
#include <time.h>   // Call time()
#include <string.h>  // Call strcmp()

#define TARGET "METHINKS IT IS LIKE A WEASEL"

int main(){
	char alphabet[28] = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char dumb_monkey[29];
	int number_of_generation = 1;
	
	/* Make every "Seed" different, to present the random characteristic of the experiment, 
	Avoiding the same pattern keep repeating. */	
	srand(time(NULL));  
	 
	for(int i = 0; i < 28; i++){
		dumb_monkey[i] = alphabet[rand() % 27];
	}
	
	printf("First dumb_monkey string: %s\n", dumb_monkey);
	
	while(strcmp(TARGET, dumb_monkey)){
		char generation[100][29];
		int bigger_score = 0;
		int bigger_score_index = 0;
		
		for(int i = 0; i < 100; i++){
			int score = 0;
			strcpy(generation[i],dumb_monkey);
			for(int j = 0; j < 29; j++){
				if(rand() % 100 <= 5){
					generation[i][j] = alphabet[rand() % 27];
				}
				if(generation[i][j] == TARGET[j]){
					score++;
				}
			}
			if(score > bigger_score){
				bigger_score_index = i;  // Pick the index of the smarter monkey.
				bigger_score = score;
			}
		}
		strcpy(dumb_monkey, generation[bigger_score_index]);  //  Changes the original string for the smarter monkey string.
		printf("Dumb_monkey atual string: %s \nGeneration %d\n\n", dumb_monkey, number_of_generation);
		number_of_generation++;
	}
	
	return 0;
}
