package com.example.android.projectfive_reportcard;

/**
 * Created by *** on 12. 5. 2017.
 */

// new Class
public class ReportCard {
    private String initialStudentName;
    private String initialStudentResidence;
    private int studentYearOfBorn;
    private int chemistryGradeNumber;
    private int geologyGradeNumber;
    private int czechGradeNumber;
    private int hydroGradeNumber;
    private int numberOfGradeNumber;
    private int averageGradeNumber;

    //Constructor
    public ReportCard(int studentYearOfBorn, int chemistryGradeNumber, int geologyGradeNumber, int czechGradeNumber, int hydroGradeNumber, int numberOfGradeNumber, int averageGradeNumber) {

        this.studentYearOfBorn = studentYearOfBorn;
        this.chemistryGradeNumber = chemistryGradeNumber;
        this.geologyGradeNumber = geologyGradeNumber;
        this.czechGradeNumber = czechGradeNumber;
        this.hydroGradeNumber = hydroGradeNumber;
        this.numberOfGradeNumber = numberOfGradeNumber;
        this.averageGradeNumber = averageGradeNumber;
    }

    public String getInitialStudentName() {
        return initialStudentName;
    }

    public String getInitialStudentResidence() {
        return initialStudentResidence;
    }

    public int getStudentYearOfBorn() {
        return studentYearOfBorn;
    }

    public int getChemistryGradeNumber() {
        return chemistryGradeNumber;
    }

    public int getGeologyGradeNumber() {
        return geologyGradeNumber;
    }

    public int getCzechGradeNumber() {
        return czechGradeNumber;
    }

    public int getHydroGradeNumber() {
        return hydroGradeNumber;
    }

    public int getNumberOfGradeNumber() {
        return numberOfGradeNumber;
    }
    public int getAverageGradeNumber() {
        averageGradeNumber = (chemistryGradeNumber+geologyGradeNumber+czechGradeNumber+hydroGradeNumber)/numberOfGradeNumber;
        return averageGradeNumber;
    }

    //Setters
    public void setStudentName(String studentName){
        initialStudentName = studentName;
    }
    public void setStudentResidence(String studentResidence){
        initialStudentResidence = studentResidence;
    }

    //toString - print information from report card
    @Override
    public String toString() {
        return "{\"Summary\":{" +
                "\"studentName\":" + "\"" + initialStudentName + "\"," +
                "\"studentResidence\":" + "\"" + initialStudentResidence + "\"," +
                "\"studentYearOfBorn\":" + studentYearOfBorn + "," +
                "\"chemistryGradeNumber\":" + chemistryGradeNumber + "," +
                "\"geologyGradeNumber\":" + geologyGradeNumber + "," +
                "\"czechGradeNumber\":" + czechGradeNumber + "," +
                "\"hydroGradeNumber\":" + hydroGradeNumber + "," +
                "\"averageGradeNumber\":" + averageGradeNumber + "," +
                "}}";

    }
}












