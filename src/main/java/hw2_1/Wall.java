package hw2_1;

public class Wall  implements Obstacle  {

    private String name;

    public Wall(String name) {
        this.name = name;
    }

    @Override
    public void jumpTheWall(Sportsman s) {
        System.out.println("this is the wall named " +this.name + " and " + s.getName() + " gets over it");
    }

    @Override
    public void runTheTrack(Sportsman s) {
        System.out.println("this is the wall named " +this.name + " and cannot be runned by " + s.getName());
    }




}
