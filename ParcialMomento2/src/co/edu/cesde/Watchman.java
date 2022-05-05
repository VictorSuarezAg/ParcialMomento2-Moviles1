package co.edu.cesde;

public class Watchman extends Person {
    private String weapon;
    private String dayOff;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String workday) {
        this.dayOff = workday;
    }

    public String showWatchman() {
        return "Name = " + this.getName() + "\n" +
                "Identification = " + this.getIdentification() + "\n" +
                "Age = " + this.getAge() + "\n" +
                "Weapon = " + this.getWeapon() + "\n" +
                "Day Off = " + this.getDayOff();
    }
}
