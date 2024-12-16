//
//  Class author:  Dylan Gillespie
//  Date created:  12/12/24
//  General description: This part is the paddle that reflects the ball towards the bricks to destory them.
//


import java.awt.*;

public class Paddle {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 0;
	}

	//methods:
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	//precondition: i is not null and is a valid integer
	//postcondition: adds a certain ammount of velocity to the paddle moving left and right
	public void addVelocity(int i) {
		velocity += i;
	}

	public void move() {
		x += velocity;
	}

	//precondition: g is not null
	//postcondition: Sets the color for the paddle
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
}
