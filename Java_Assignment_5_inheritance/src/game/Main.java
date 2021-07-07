package game;

public class Main {
	public static void main(String[] args) {
	GameObject player = new Player();
	GameObject enemy = new Enemy();
	
	player.update();
	enemy.update();
	}
}
