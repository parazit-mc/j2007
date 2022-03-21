package hw2_1;
//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
//        классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
//        консоль).
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий.

public class hw2_1 {

    public static void main(String[] args) {
        Sportsman cat = new Cat("vaska");
        Sportsman human = new Human("putin");
        Sportsman robot = new Robot("android");

        Sportsman [] sports = {cat,human,robot};

        Wall wall = new Wall("theWall");
        Track track = new Track("theTrack");

        Obstacle [] obstacles = {wall, track};

        for (int i = 0; i < obstacles.length; i++) {
            for (Sportsman ss: sports) {
                obstacles[i].jumpTheWall(ss);
                obstacles[i].runTheTrack(ss);
            }
        }

    }
}
