package Projekat;
	/*
	Projekat 1
	Elvedin Grbovic 22/146  -  Konstantin Draskovic 24/157
	FPRN:Elektrotehnika i Racunarstvo
	 */
public class GameObject {
	private int x;
	private int y;
	private int width, height;
	
	// konstruktor
    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
	//geteri i seteri
    public int getX() { return x;}
    public void setX(int x) {this.x = x;}
    
    public int getY() { return y; }
    public void setY(int y) {this.y = y;}
    
    public int getWidth() { return width; }
    public void setWidth(int width) {
    	if (width > 0)
    		this.width = width;
    	}
    
    public int getHeight() { return height; }
    public void setHeight(int height) {
    	if (height > 0)
    		this.height = height;
    	}
    @Override
    public String toString() {
        return "@ (" + x + "," + y + ")" + width + "x" + height;
    }
    
    public static boolean intersect(Player p, Enemy e) {
	    return p.getX() < e.getX() + e.getWidth() &&      
	           p.getX() + p.getWidth() > e.getX() &&      
	           p.getY() < e.getY() + e.getHeight() &&     
	           p.getY() + p.getHeight() > e.getY();
	}
    
}
