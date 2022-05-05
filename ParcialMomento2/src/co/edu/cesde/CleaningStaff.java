package co.edu.cesde;

public class CleaningStaff  extends Person {
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public String showCleaningStaff() {
        return "Name = " + this.getName() + "\n" +
                "Identification = " + this.getIdentification() + "\n" +
                "Age = " + this.getAge() + "\n" +
                "Day Off = " + this.getDayOff();
    }
}
