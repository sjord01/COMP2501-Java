public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYyMmDd() {
        return "" + year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

public class Name {
    private String first;
    private String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFullName() {
        return first + " " + last;
    }

    public String getInitials() {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}

public class Student {
    private Name name;
    private String studentNumber;
    private Date dateOfBirth;
    private boolean graduated;

    public Student(Name name, String studentNumber, Date dateOfBirth, boolean graduated) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;
    }

    public Name getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGraduated() {
        return graduated;
    }
}