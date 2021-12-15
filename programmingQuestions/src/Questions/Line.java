package Questions;

public class Line {
    private int p1X;
    private int p1Y;
    private int p2X;
    private int p2Y;

    public Line(int p1xc, int p1yc, int p2xc, int p2yc) {
        this.p1X = p1xc;
        this.p1Y = p1yc;
        this.p2X = p2xc;
        this.p2Y = p2yc;
    }

    public String getP1() {
        return "(" + this.p1X + ", " + this.p1Y + ")";
    }

    public String getP2() {
        return "(" + this.p2X + ", " + this.p2Y + ")";
    }

    public String createLine() {
        return "[(" + this.p1X + ", " + this.p1Y + ") , " + "(" + this.p2X + ", " + this.p2Y + ")]";
    }
}

