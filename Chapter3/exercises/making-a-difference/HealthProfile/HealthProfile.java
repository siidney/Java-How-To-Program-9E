/*
 *       Filename:  HealthProfile.java
 *
 *    Description:  3.16 - Design a "starter" HealthProfile class for a person.
 *                  The class attributes should include:
 *                      String  - first name
 *                      String  - last name
 *                      String  - gender
 *                      int     - dob - consisting of separate attributes (d m y)
 *                      double  - height
 *                      double  - weight
 *                  Then calculates and prints the persons age in years, BMI,
 *                  maximum and target heartrate range. Also display the
 *                  previousy defined BMI values chart.
 *
 *        Created:  29/09/15 11:02:23
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HealthProfile{
    private String fName, lName, gender;
    private int[] dob = new int[3];
    private int measurementSystem; // 1 - imperial, 2 - metric
    private double height, weight; // inches and pounds

    public HealthProfile(String fName, String lName, String gender,
            int[] dob, double height, double weight, int measurementSystem){

        setFirstName(fName);
        setLastName(lName);
        setGender(gender);
        setDOB(dob);
        setHeight(height);
        setWeight(weight);
        setMeasurementSystem(measurementSystem);
    }

    // SETTERS
    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDOB(int[] dob){
        this.dob = dob;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setMeasurementSystem(int measurementSystem){
        this.measurementSystem = measurementSystem;
    }
    // GETTERS
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public String getGender(){
        return gender;
    }
    public int[] getDOB(){
        return dob;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - dob[2];
    }
    // BMI - determine system of measurement
    public double getBMI(){
        return (measurementSystem == 1) ? calculateImperial() : calculateMetric();
    }
    // calculate using imperial measures
    private double calculateImperial(){
        return ((weight * 700) / (height * height));
    }
    // calculate using metric measures
    private double calculateMetric(){
        return weight / (height * height);
    }
    public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
    // print health information
    public void showHealthProfile(){
        System.out.println("\n********** YOUR HEALTH PROFILE **********");
        System.out.printf("Name:\t%s %s\n", fName, lName);
        System.out.printf("DOB:\t%d/%d/%d\nAge:\t%d\n", dob[0], dob[1], dob[2], getAge());
        System.out.printf("Height:\t%.2f inches\nWeight: %.2f pounds\n", height, weight);
        System.out.printf("\n***** HEARTRATE *****\n");
        System.out.printf("Max:\t%d\nTarget:\t%s\n", getMaxHeartRate(), getTargetHeartRate());
        System.out.printf("\n***** BMI *****\n");
        System.out.printf("Your BMI: %.1f\n\n", getBMI());
        printBmiTable();
    }
    // print BMI information from Department of Health and Human Services /
    // National Institutes of Health.
    private void printBmiTable(){
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
