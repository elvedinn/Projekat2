package Projekat;

public class Enemy extends GameObject {
	private String type;
    private int damage;
    private int health;

    public Enemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(x, y, width, height);
        this.type = type;
        this.damage = damage;
        this.health = health;
    }
    // getteri i setteri
    public String getType() { return type; }
    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            this.type = "Unknown";
            }
        }
    public int getDamage() { return damage; }
    public void setDamage(int damage) {
        if (damage < 0) this.damage = 0;
        else if (damage > 100) this.damage = 100;
        else this.damage = damage;
    }
    public int getHealth() { return health; }
    public void setHealth(int health) {
        if (health < 0) this.health = 0;
        else if (health > 100) this.health = 100;
        else this.health = health;
    }
	
    @Override
    public String toString() {
        return "Enemy[" + type + "]" + super.toString() + " DMG=" + damage + " HP=" + health;
    }

}
