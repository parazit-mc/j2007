package hw2_1;

public class Track implements Obstacle {

    private String name;

    public Track(String name) {
        this.name = name;
    }

//    @Override
//    public void jumpTheWall(Sportsman s) {
//        System.out.println("this obstacle named "+ this.name+ " is not jumpable and " + s.getName() + " cannot jump over it");
//    }
//
//    @Override
//    public void runTheTrack(Sportsman s) {
//        System.out.println(s.getName() + " succesfully run the track " + this.name);
//
//
//    }

    @Override
    public void overcome(Sportsman s) {
        System.out.println(s.getName() + " succesfully run the track " + this.name);
    }
}
