package Projekat;

public class Player extends GameObject {
	private String name;
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {
        super(x, y, width, height);
        this.name = name;
        this.health =health;
        }
  //geteri i seteri
    public String getName() {return name;}
    public void setName() {
    	if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        }
    }
    public int getHealth() { return health; }
    public void setHealth(int health) {
        if (health < 0) {
        	this.health = 0;
        } else if (health > 100) {
        	this.health = 100;
        } else {
        	this.health = health;
        }
    }
    @Override
    public String toString() {
        return "Player[" + name + "]" + super.toString() + " HP=" + health;
    }

}
