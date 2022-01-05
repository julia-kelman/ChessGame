public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;


    //קונסטרקטור לבניית תבנית לשחקן חדש
    public Player(String name, String email, boolean white, int rank, int age) {

        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("error in name");
        } else {
            this.name = name;
        }

        if (email == null || email.isEmpty() || email.isBlank()) {
            throw new IllegalArgumentException("error in email");
        }
        if (email.contains("@") == false || email.contains(".") == false) {
            throw new IllegalArgumentException("error in email structure");
        } else {
            this.email = email;
        }
//
//        if (rank.isBlank() || rank<100 || rank<3000){
//            throw new IllegalArgumentException("error in rank");
//        }
//        else{
//            this.rank=rank;
//        }
////
//        if (age.isEmpty() || age<18 || age>100){
//            throw new IllegalArgumentException("error in age");
//        }
//        else {
//            this.age=age;
//        }

        this.white=white;
        this.rank=rank;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWhite() {
        return white;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }

    public void setRank(int rank) {

        if(rank<100 || rank>3000){
            throw new IllegalArgumentException("error");
        }
        this.rank = rank;
    }

    public void movePiece(Piece piece, Spot spot){
        piece.setSpot(spot);
        System.out.println("piece "+piece.getName()+" is moved to: "+ spot);

        //test : white player cant use black piece:
        if(isWhite() != piece.isWhite()){
            throw new IllegalArgumentException("color doesn't match");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }



}
