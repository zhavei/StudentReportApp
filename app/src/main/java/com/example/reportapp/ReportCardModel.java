package com.example.reportapp;

public class ReportCardModel {

    private String subjectName;
    private int subjectMarks;
    private String subjectGrade;
    private int subjectIcon;

    ReportCardModel(int icon, String name, int mark, String grade) {
        this.setSubjectName(name);
        this.setSubjectGrade(grade);
        this.setSubjectIcon(icon);
        this.setSubjectMarks(mark);

    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(int subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public String getSubjectGrade() {
        return subjectGrade;
    }

    public void setSubjectGrade(String subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public int getSubjectIcon() {
        return subjectIcon;
    }

    public void setSubjectIcon(int subjectIcon) {
        this.subjectIcon = subjectIcon;
    }

    @Override
    public String toString() {
        return " yoo child got " + subjectGrade + "\n Grade in " + subjectName;
    }


}
