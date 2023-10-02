public class Main {
    public static void main(String[] args) {
        Weapon knife = new Weapon("Knife");
        Weapon bowAndArrow = new Weapon("Bow and Arrow");
        Weapon axe = new Weapon("Axe");
        Weapon sword = new Weapon("Sword");

        Character king = new Character("King", sword);
        Character elf = new Character("Elf", bowAndArrow);
        Character dwarf = new Character("Dwarf", axe);
        Character hobbit = new Character("Hobbit", knife);

        System.out.println(king.getName() + " is equipped with " + king.getCurrentWeapon().getName());
        System.out.println(elf.getName() + " is equipped with " + elf.getCurrentWeapon().getName());
        System.out.println(dwarf.getName() + " is equipped with " + dwarf.getCurrentWeapon().getName());
        System.out.println(hobbit.getName() + " is equipped with " + hobbit.getCurrentWeapon().getName());

        king.fight();
        elf.fight();
        dwarf.fight();
        hobbit.fight();

        king.setCurrentWeapon(axe);
        elf.setCurrentWeapon(sword);
        dwarf.setCurrentWeapon(knife);
        hobbit.setCurrentWeapon(bowAndArrow);

        System.out.println("\nAfter changing weapons:\n");
        
        System.out.println(king.getName() + " is equipped with " + king.getCurrentWeapon().getName());
        System.out.println(elf.getName() + " is equipped with " + elf.getCurrentWeapon().getName());
        System.out.println(dwarf.getName() + " is equipped with " + dwarf.getCurrentWeapon().getName());
        System.out.println(hobbit.getName() + " is equipped with " + hobbit.getCurrentWeapon().getName());
    }
}