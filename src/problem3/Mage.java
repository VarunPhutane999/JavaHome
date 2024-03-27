package problem3;

    class Mage extends Character {
        public Mage(String name, int level, int hp, int mp) {
            super(name, level, hp, mp);
        }
    
        @Override
        public void attack() {
            System.out.println(name + " が火の球を放った！");
        }
    
        @Override
        public void defend() {
            System.out.println(name + " が魔法の盾で防御した！");
        }
    
}
