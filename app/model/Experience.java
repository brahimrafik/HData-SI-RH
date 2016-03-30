package model;

/**
 * Created by root on 30/03/16.
 */
public class Experience {
    int begin_year,end_year;
    String company, position, description;

    public int getBegin_year() {
        return begin_year;
    }

    public void setBegin_year(int begin_year) {
        this.begin_year = begin_year;
    }

    public int getEnd_year() {
        return end_year;
    }

    public void setEnd_year(int end_year) {
        this.end_year = end_year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
