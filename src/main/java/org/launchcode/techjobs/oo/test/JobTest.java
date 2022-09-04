package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
//import org.launchcode.techjobs.oo.Job;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobID() {

        // {data-type} {var-name} = {value};

        Job job = new Job();
        Job job2 = new Job();
        assertNotEquals(job.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        // Declaring a variable:
        // {data-type} {var-name} = {value};
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality Control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2  = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String job1 = job.toString();
        char firstChar = job1.charAt(0);
        // Check that the first line is blank
        assertEquals('\n', firstChar);
        // Check that the last line is blank
        // "Hello"
        //  01234  - job1.length() == 5
        char lastChar = job1.charAt(job1.length()- 1);
        assertEquals('\n',lastChar);

//        public String toString() {
//        assertEquals(" ",);
//        if ()
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String job1 = job.toString();
        /*"" - 0
        "ID: 0" -1
        "Name: Product tester" - 2
        Employer: ACME
         */
        String line1 = job1.split("\n")[1];
        assertEquals("ID: " + job.getId(), line1);
        String line2 = job1.split("\n")[2];
        assertEquals("Name: Product tester", line2);
        String line3 = job1.split("\n")[3];
        assertEquals("Employer: ACME", line3);
        String line4 = job1.split("\n")[4];
        assertEquals("Location: Desert",line4);
        String line5 = job1.split("\n")[5];
        assertEquals("Position Type: Quality Control", line5);
        String line6 = job1.split("\n")[6];
        assertEquals("Core Competency: Persistence", line6);
    }
    @Test
   public void testToStringHandlesEmptyField() {
        Job job = new Job();
        String job1 = job.toString();


        String line1 = job1.split("\n")[1];
        assertEquals("ID: " + job.getId(), line1);
        String line2 = job1.split("\n")[2];
        assertEquals("Name: Data not available", line2);
        String line3 = job1.split("\n")[3];
        assertEquals("Employer: Data not available", line3);
        String line4 = job1.split("\n")[4];
        assertEquals("Location: Data not available",line4);
        String line5 = job1.split("\n")[5];
        assertEquals("Position Type: Data not available", line5);
        String line6 = job1.split("\n")[6];
        assertEquals("Core Competency: Data not available", line6);
    }
}

