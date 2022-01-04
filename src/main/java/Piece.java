public abstract class Piece {

    private String name;
    private boolean white;
    private boolean killed;
    private Spot spot;
    private String ID;

    //String x;
    //int y;


    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }



    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return white;
    }

    public boolean isKilled() {
        return killed;
    }

    public Spot getSpot() {
        return spot;
    }

    public String getID() {
        return ID;
    }



    public Piece(String name, Spot spot, String ID, boolean white) {
        this.name = name;
        this.spot = spot;
        this.ID = ID;
        this.white = white;
    }




    @Override
    public String toString() {
        return "Piece{" +
                "name='" + name + '\'' +
                ", white=" + white +
                ", killed=" + killed +
                ", spot=" + spot +
                ", ID='" + ID + '\'' +
                '}';
    }
}
