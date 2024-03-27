package problem3;


    class Warrior extends Character {
        public Warrior(String name, int level, int hp, int mp) {
            super(name, level, hp, mp);
        }
        @Override
        public void attack() {
            System.out.println(name + " が剣で攻撃した！");
        }
        @Override
        public void defend() {
            System.out.println(name + " が盾で防御した！");
        }
    }
    
