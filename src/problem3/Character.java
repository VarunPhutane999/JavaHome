package problem3;

public class Character {
    protected String name;
    private  int level;
    private  int hp;
    private  int mp;

    public Character(String name, int level, int hp, int mp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
    }

    public void attack() {
        System.out.println(name + " が攻撃した！");
    }


    public void defend() {
        System.out.println(name + " が防御した！");
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Level: " + level + ", HP: " + hp + ", MP: " + mp);
    }
    
}
