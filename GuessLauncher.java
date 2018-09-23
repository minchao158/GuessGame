package GuessGame;

import java.util.Arrays;

public class GuessLauncher {

	public static void main(String[] args) {
	
		GuessGame game=new GuessGame();
		int i=1;
		do {
			game.startGame();
			i++;
		}while(i!=4);
 
	System.out.println("玩家1的分数为："+game.score[0]+" 玩家2的分数为："+game.score[1]+" 玩家3的分数为："+game.score[2]);
	Arrays.sort(game.score);
	System.out.println("最大数为："+game.score[game.score.length-1]);
	}

}
