import java.util.Scanner;
public class GolfScores {
		public static void main(String[] args) {

			// TODO Auto-generated method stub

			int [][] scores = new int[9][4]; //creates a 2d array named scores
			String [] title = new String[4]; //creates an array named strings

			Scanner sc = new Scanner(System.in); //initializes the scanner class

			title[0] = "\t"; //initilizes the values for title
			title[1] = "Par\t"; //initilizes the values for title
			title[2] = "P1\t";//initilizes the values for title
			title[3] = "P2\t";//initilizes the values for title
			
			System.out.println("");

			scores[0][0] = 1; //initializes the holes for scores
			scores[1][0] = 2;//initializes the holes for scores
			scores[2][0] = 3;//initializes the holes for scores
			scores[3][0] = 4;//initializes the holes for scores
			scores[4][0] = 5;//initializes the holes for scores
			scores[5][0] = 6;//initializes the holes for scores
			scores[6][0] = 7;//initializes the holes for scores
			scores[7][0] = 8;//initializes the holes for scores
			scores[8][0] = 9;//initializes the holes for scores

			int input = 0; //declares an int input and sets it to 0
			int hole = 1; //declares an int hole and sets it to 1

			for(int r = 0; r< scores.length; r++){
				for(int c=1; c< scores[0].length;c++){ //traverses through the entire array 
					if(c==1){
						System.out.print("What is the par on hole " + hole + "?: "); //user prompt
					}
					if(c==2){
						System.out.print("What is Player 1's score?: "); //user prompt
					}
					if(c==3){
						System.out.print("What is Player 2's score?: "); //user prompt
					}
					input = sc.nextInt(); //sets input to user input
					scores[r][c] = input; //sets an index in an array to an input
				}
				hole++; //adds 1 to hole
			}

			int par = 0; //declares an int par and sets it to 0
			int p1 = 0;  //declares an int p1 and sets it to 0
			int p2 = 0; //declares an int p2 and sets it to 0

			for(int x=0; x<scores.length;x++){
				for(int y=0; y<scores[0].length;y++){
					if(y == 1){
						par += scores[x][1]; //sets par values
					}
					if(y == 2){
						p1 += scores[x][2]; //sets p1 values
					}
					if(y == 3){
						p2 += scores[x][3]; //sets p2 values
					}
				}
			}

			for(int a=0; a < title.length; a++){
				System.out.print(title[a]); //prints out title
			}

			System.out.println();

			for(int s=0; s < scores.length;s++){
				for(int d = 0; d< scores[0].length;d++){
					System.out.print(scores[s][d] + "\t"); //prints out the card
				}
				System.out.println();
			}

			//array that holds the sum of each hole
			int prscores[] = {(scores[1][2] + scores[1][3]), (scores[2][2] + scores[2][3]), (scores[3][2] + scores[3][3]), (scores[4][2] + scores[4][3]), (scores[5][2] + scores[5][3]), (scores[6][2] + scores[6][3]), (scores[7][2] + scores[7][3]), (scores[8][2] + scores[8][3])}; 
			
			int highest = 0; //declares the int highest and sets it to 0
			
			int p1num1 = scores[1][2]; //declares an int and sets it to an array index
			int p1num2 = scores[2][2]; //declares an int and sets it to an array index
			int p1num3 = scores[3][2]; //declares an int and sets it to an array index
			int p1num4 = scores[4][2]; //declares an int and sets it to an array index
			int p1num5 = scores[5][2]; //declares an int and sets it to an array index
			int p1num6 = scores[6][2]; //declares an int and sets it to an array index
			int p1num7 = scores[7][2]; //declares an int and sets it to an array index
			int p1num8 = scores[8][2]; //declares an int and sets it to an array index

			int p2num1 = scores[1][3]; //declares an int and sets it to an array index
			int p2num2 = scores[2][3]; //declares an int and sets it to an array index
			int p2num3 = scores[3][3]; //declares an int and sets it to an array index
			int p2num4 = scores[4][3]; //declares an int and sets it to an array index
			int p2num5 = scores[5][3]; //declares an int and sets it to an array index
			int p2num6 = scores[6][3]; //declares an int and sets it to an array index
			int p2num7 = scores[7][3]; //declares an int and sets it to an array index
			int p2num8 = scores[8][3]; //declares an int and sets it to an array index

			
			int p1wins = 0; //declares an int p1wins and sets it to 0
			int p2wins = 0; //declares an int p2wins and sets it to 0
			
			if(p1num1 > p2num1){
				p2wins++;         //if statement comparing values
			}
			else if(p1num1 < p2num1){
				p1wins++; // else if statement comparing values
			}
			
			if(p1num2 > p2num2){
				p2wins++;//if statement comparing values
			}
			else if(p1num2 < p2num2){
				p1wins++; // elseif statement comparing values
			}
			
			if(p1num3 > p2num3){
				p2wins++;//if statement comparing values
			}
			else if(p1num3 < p2num3){
				p1wins++; // else if statement comparing values
			}
			
			if(p1num4 > p2num4){
				p2wins++;//if statement comparing values
			}
			else if(p1num4 < p2num4){
				p1wins++;// else if statement comparing values
			}
			
			if(p1num5 > p2num5){
				p2wins++;//if statement comparing values
			}
			else if(p1num5 < p2num5){
				p1wins++; // else if statement comparing values
			}
			
			if(p1num6 > p2num6){
				p2wins++;//if statement comparing values
			}
			else if(p1num6 < p2num6){
				p1wins++; //else if statement comparing values
			}
			
			if(p1num7 > p2num7){
				p2wins++;//if statement comparing values
			}
			else if(p1num7 < p2num7){
				p1wins++; //else if statement comparing values
			}
			
			if(p1num8 > p2num8){
				p2wins++;//if statement comparing values
			}
			else if(p1num8 < p2num8){
				p1wins++; //else if statement comparing values
			}
			
			
			for(int q=0; q < prscores.length; q++){ //array traverse

				if(prscores[q] > highest){
					highest = prscores[q]; //sets a value and sets it to the int highest
				}

			}
			
			System.out.println("The par of the entire course is: " + par); //prints out to the console
			System.out.println("Player 1's score is: " + p1);//prints out to the console
			System.out.println("Player 2's score is: " + p2);//prints out to the console
			System.out.println("The highest combined hole score is: " + highest);//prints out to the console


				if(p1 < par){//if statement comparing values
					System.out.println((par - p1 ) + " under par.");//prints out to the console
				}
				else if(p1 > par){// else if statement comparing values
					System.out.println((p1 - par ) + " over par.");//prints out to the console
				}
				else if(p1 == par){// else if statement comparing values
					System.out.println("At Par.");//prints out to the console
				}
			
				if(p2 < par){//if statement comparing values
					System.out.println((par - p2 ) + " under par.");//prints out to the console
				}
				else if(p2 > par){// else if statement comparing values
					System.out.println((p2 - par ) + " over par.");//prints out to the console
				}
				else if(p2 == par){// else if statement comparing values
					System.out.println("At Par.");//prints out to the console
				}
				if(p1 < p2){//if statement comparing values
					System.out.println("Player 1 won " + p1wins + " hole(s).");//prints out to the console
				}
				else if(p2 < p1){// else if statement comparing values
					System.out.println("Player 2 won " + p2wins + " hole(s).");//prints out to the console
				}
				else if(p1 == p2){// else if statement comparing values
					System.out.println("Tie Score.");//prints out to the console
				}
				sc.close();
		}

}
