package com.monocept.model.test;

import java.util.Scanner;

public class PigDiceGameTest {
   private int score=0;
   public void gamePlay() {
	   int turn=0;
	   while(true) {
		   this.score+=diceRoll();
		   turn++;
		   if(this.score>=20)
			   break;
	   }
	   System.out.println("Game Over!"+"\n"+"Total Score"+score+"\n"+"Total Turns "+turn);
   }
   
   public int diceRoll() {
	   int temp =0;
	   while(true) {
		   int die= ((int)(Math.random()*6)+1);
		   Scanner sc = new Scanner(System.in);
		   System.out.println("die: "+die);
		   temp+=die;
		   if(die==1)
			   return 0;
		   if(this.score+temp>=20)
			   return temp;
		   System.out.println("Roll or hold? (r/h)");
		   char choice = sc.next().charAt(0);
		   if(choice == 'h' || choice=='H')
			   continue;
		   return temp;
	   }
   }
   public static void main(String[] args) {
		PigDiceGameTest player = new PigDiceGameTest();
		player.gamePlay();

	}

}
