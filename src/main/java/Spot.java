public class Spot {

    String x;
    int y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Spot(String x, int y) {
        this.x = x;
        this.y = y;

        //test: user is within the board:
        if (x.compareTo("H")>0 || y>8 || y<=0){
            throw new IllegalArgumentException("Outside the board");
        }
    }


    @Override
    public String toString() {
        return "Spot{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }

}
