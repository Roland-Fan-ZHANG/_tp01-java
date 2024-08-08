package _tp01;

public record Point(int x, int y) {
	
	public double distance(Point p1, Point p2) {
		var x = p1.x - p2.x;
		var y = p1.y - p2.y;
		return Math.sqrt(x * x + y * y);
	}
	
	public static void main(String[] args) {
		// Exercice 4.2
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("x=" + x + ", y=" + y);
		// Exercice 4.5
		Point point1 = new Point(3, 4);
		System.out.println(point1);
		// Exercice 4.6
		Point pointOrigin = new Point(0, 0);
		System.out.println("dist = " + pointOrigin.distance(pointOrigin, point1));
	}
}
