package com.example.android.projectfive_reportcard;

/**
 * Created by *** on 12. 5. 2017.
 */

// new Class
public class ReportCard {
    private String studentName;
    private String studentResidence;
    private int studentYearOfBorn;
    private int chemistryGradeNumber;
    private int geologyGradeNumber;
    private int czechGradeNumber;
    private int hydroGradeNumber;
    private int numberOfGradeNumber;
    private int averageGradeNumber;

    //Constructor
    public ReportCard(int studentYearOfBorn, int chemistryGradeNumber, int geologyGradeNumber, int czechGradeNumber, int hydroGradeNumber, int numberOfGradeNumber, int averageGradeNumber) {

        this.studentName = "Aaaaa Bbbb";
        this.studentResidence = "New New York";
        this.studentYearOfBorn = studentYearOfBorn;
        this.chemistryGradeNumber = chemistryGradeNumber;
        this.geologyGradeNumber = geologyGradeNumber;
        this.czechGradeNumber = czechGradeNumber;
        this.hydroGradeNumber = hydroGradeNumber;
        this.numberOfGradeNumber = numberOfGradeNumber;
        this.averageGradeNumber = averageGradeNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentResidence() {
        return studentResidence;
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
    //toString - print information from report card
    @Override
    public String toString() {
        return "{\"Summary\":{" +
                "\"studentName\":" + "\"" + studentName + "\"," +
                "\"studentResidence\":" + "\"" + studentResidence + "\"," +
                "\"studentYearOfBorn\":" + studentYearOfBorn + "," +
                "\"chemistryGradeNumber\":" + chemistryGradeNumber + "," +
                "\"geologyGradeNumber\":" + geologyGradeNumber + "," +
                "\"czechGradeNumber\":" + czechGradeNumber + "," +
                "\"hydroGradeNumber\":" + hydroGradeNumber + "," +
                "\"averageGradeNumber\":" + averageGradeNumber + "," +
                "}}";

    }
}












