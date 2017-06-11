package com.example.android.reportcard;

/**
 * Created by Om on 19-Mar-17.
 */

public class ReportCard {

    private String mStudentName;
    private String clgRollNo;
    private int mOOPMarks;
    private int mDbmsMarks;
    private int mDeldMarks;
    private int mOSMarks;
    private int mITLMarks;
    private int sum;
    private float percentage;
    private String grade;

    public ReportCard(String studentName, String RollNo, int OOPMarks, int DbmsMarks, int DeldMarks, int OSMarks, int ITLMarks) {
        mStudentName = studentName;
        clgRollNo = RollNo;
        mOOPMarks = OOPMarks;
        mDbmsMarks = DbmsMarks;
        mDeldMarks = DeldMarks;
        mOSMarks = OSMarks;
        mITLMarks = ITLMarks;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String studentName) {
        mStudentName = studentName;
    }

    public String getClgRollNo() {
        return clgRollNo;
    }

    public void setClgRollNo(String RollNo) {
        clgRollNo = RollNo;
    }

    public int getmOOPMarks() {
        return mOOPMarks;
    }

    public void setmOOPMarks(int OOPMarks) {
        mOOPMarks = OOPMarks;
    }

    public int getmDbmsMarks() {
        return mDbmsMarks;
    }

    public void setmDbmsMarks(int DbmsMarks) {
        mDbmsMarks = DbmsMarks;
    }

    public int getmDeldMarks() {
        return mDeldMarks;
    }

    public void setmDeldMarks(int DeldMarks) {
        mDeldMarks = DeldMarks;
    }

    public int getmOSMarks() {
        return mOSMarks;
    }

    public void setmOSMarks(int OSMarks) {
        mOSMarks = OSMarks;
    }

    public int getmITLMarks() {
        return mITLMarks;
    }

    public void setmITLMarks(int ITLMarks) {
        mITLMarks = ITLMarks;
    }

    private String dispResult(int mOOPMarks, int mDbmsMarks, int mDeldMarks, int mOSMarks, int mITLMarks) {
        sum = mOOPMarks + mDbmsMarks + mDeldMarks + mOSMarks + mITLMarks;
        percentage = (sum / 500) * 100;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage > 80 && percentage < 90) {
            grade = "B";
        } else if (percentage > 70 && percentage < 80) {
            grade = "C";
        } else if (percentage > 60 && percentage < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;

    }

    @Override
    public String toString() {
        return "ReportCard :- " +
                "StudentName = " + mStudentName + ",\n" +
                "RollNumber = " + clgRollNo + ",\n" +
                "You have GRADE = " + grade;
    }
}
