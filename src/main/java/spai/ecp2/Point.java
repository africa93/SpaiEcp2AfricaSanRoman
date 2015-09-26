package spai.ecp2;

public class Point {
    
    private int x, y;

    public Point(int x, int y) {
        this.x = limitar(x);
        this.y = limitar(y);
    }

	public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }
    
    private int limitar(int coordenada) {
		if(coordenada < 0){
			coordenada = 0;
		} else if(coordenada > 100){
			coordenada = 100;
		}
		return coordenada;
	}

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }
    
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
}
