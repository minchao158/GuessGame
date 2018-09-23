package GuessGame;

import java.util.Scanner;

public class GuessGame{
	 Player player1;
	 Player player2;
	 Player player3;
Player p;
	 Player[] A= {player1,player2,player3};
	 int[] score={0,0,0};
	void startGame()
	{
		for(int i=0;i<3;i++)
		{
			try{@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int t=(int)(Math.random()*10);
			if(sc.nextInt()==t)
			{
				score[i]++;
				System.out.println("玩家"+i+"猜对了！"+score[i]);
			}
			
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("异常");
			}
		}
	}
}
