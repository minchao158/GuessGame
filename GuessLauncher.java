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
 
	System.out.println("���1�ķ���Ϊ��"+game.score[0]+" ���2�ķ���Ϊ��"+game.score[1]+" ���3�ķ���Ϊ��"+game.score[2]);
	Arrays.sort(game.score);
	System.out.println("�����Ϊ��"+game.score[game.score.length-1]);
	}

}
