public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(200);

        Weapon weapon = new Weapon();
        weapon.setGun("ak47");


        System.out.println("Информация о босе:" + " " + boss.getDamage() + "," + " " + boss.getHealth() +
                ".");
    }
}