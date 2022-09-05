package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    // HashMap<String, String> job;
    // job.put("name", "Job Name");
    // job.put("employer", "Bob's Furniture");
    // job.put("salary", "75000");
    // job.put("employer", "Different Employer");
    // job.get("banana");
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add toString here

    @Override
    public String toString() {
        String nameData = toStringWithDefault(name, "Data not available");
        String employerData = toStringWithDefault(employer, "Data not available");
        String locationData = toStringWithDefault(location, "Data not available");
        String positionTypeData = toStringWithDefault(positionType, "Data not available");
        String coreCompetencyData = toStringWithDefault(coreCompetency, "Data not available");

        return "\n" +
                "ID: " + id + "\n" +
                "Name: " + nameData + "\n" +
                "Employer: " + employerData + "\n" +
                "Location: " + locationData + "\n" +
                "Position Type: " + positionTypeData + "\n" +
                "Core Competency: " + coreCompetencyData +
                "\n";
    }

    private static String toStringWithDefault(Object obj, String defaultValue) {
        if (obj == null || obj.toString().isEmpty()) {
            return defaultValue;
        }
        return obj.toString();
    }
}
