package co.edu.cesde;

public class Admin extends Person {
    private String leader;
    private String parking;

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String showAdmin() {
        return "Name = " + this.getName() + "\n" +
                "Identification = " + this.getIdentification() + "\n" +
                "Age = " + this.getAge() + "\n" +
                "Leader = " + this.getLeader() + "\n" +
                "Parking = " + this.getParking();
    }
}
