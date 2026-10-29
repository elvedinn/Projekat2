package Projekat;

import java.util.ArrayList;

public class Game {
	private Player player;
	private static ArrayList<Enemy> enemies = new ArrayList<>();
	private static ArrayList<String> eventLog = new ArrayList<>();
	
	public Player getPlayer() {return player;}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Game(Player player) {
        this.setPlayer(player);
	}
	
	public static void printEventLog() {
        System.out.println("Event Log");
        for (String event : eventLog) {
            System.out.println(event);
        }
    }
	
	public static boolean checkCollision(Player p, ArrayList<Enemy> enemies) {
	    for (Enemy e : enemies) {
	        if (p.getX() < e.getX() + e.getWidth() &&
	            p.getX() + p.getWidth() > e.getX() &&
	            p.getY() < e.getY() + e.getHeight() &&
	            p.getY() + p.getHeight() > e.getY()) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static void addEnemy(Enemy e) {
        enemies.add(e);
        eventLog.add("Enemy added: " + e.getType() + " at (" + e.getX() + "," + e.getY() + ")");
    }
	
	public static Enemy findByType(Enemy[] enemies, String type) {
	    for (Enemy e : enemies) {
	        if (e.getType().toLowerCase().contains(type.toLowerCase())) {
	            return e;
	        }
	    }
	    return null;
	}
	
	public static String collidingWithPlayer() {
    	return null;
    }
	
	

	public static void main(String[] args) {
		Player p1 = new Player("Darko", 12, 5, 10, 10, 100);
		addEnemy(new Enemy("Goblin", 10, 5, 16, 16, 15, 50));
        addEnemy(new Enemy("Orc", 20, 8, 20, 20, 25, 70));
        addEnemy(new BossEnemy("Goblin King", 12, 3, 32, 32, 25, 120));
        Game game = new Game(p1);
        printEventLog();
        System.out.println("Kolizija: " + checkCollision(game.getPlayer(), enemies));
	}


}
