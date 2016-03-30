package model;

/**
 * Created by root on 30/03/16.
 */
public class Education {
    String school, degree, field;
    int begin_year,end_year;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getEnd_year() {
        return end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    public int getBegin_year() {
        return begin_year;
    }

    public void setBegin_year(int begin_year) {
        this.begin_year = begin_year;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
