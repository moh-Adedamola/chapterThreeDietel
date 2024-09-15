package chapterThree.car.targetHeartRateCalculator;

import java.time.LocalDate;
import java.time.Period;


public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth) {
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public void setMonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

        int age = Period.between(birthDate, currentDate).getYears();

        return age;
    }

    public int calculateMaxHeartRate() {

        int maxHeartRate = 220 - calculateAge();
        return maxHeartRate;
    }


}
