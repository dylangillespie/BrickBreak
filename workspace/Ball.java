//
//  Class author:  Dylan Gillespie
//  Date created:  12/12/24
//  General description: This part is the ball in the game that hits the bricks to lower the health.
//  It will reflect off the paddle in the game to redirect towards more bricks.
//


import java.awt.*;

public class Ball {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	private int size;
	
	//constructor(s):
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.xVelocity = 1;
		this.yVelocity = -2;
	}
	
	//methods:
	public int getXpos() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getYpos() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

    public int getXVelocity() {
        return xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYVelocity() {
        return yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

	public int getSize() {
		return size;
	}

	public void reverseX() {
		xVelocity = -xVelocity;
	}

	public void reverseY() {
		yVelocity = -yVelocity;
	}

	public void move() {
		x += xVelocity;
		y += yVelocity;
	}

	//precondition: g is not null
	//postcondition: Sets the color for the ball
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, size, size);
	}
}
