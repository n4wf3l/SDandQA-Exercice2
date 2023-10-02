public class Character {
    private String name;
    private Weapon currentWeapon;

    Character(String name, Weapon defaultWeapon) {
        this.name = name;
        this.currentWeapon = defaultWeapon;
    }

    String getName() {
        return name;
    }

    Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    void setCurrentWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }

    void fight() {
        System.out.println(name + " is fighting with " + currentWeapon.getName());
    }
}
