/**
 * Records the year, month, and day when a student was born; date of birth
 *
 * @author ross & sam ordonez
 * @version 1.0
 */

public class Date
{
    private int year;
    private int month;
    private int day;

    /**
     * @param year the year a student was born
     * @param month the month a student was born
     * @param day the day a student was born
     */
    public Date(final int year,
                final int month,
                final int day)
    {
        this.year   = year;
        this.month  = month;
        this.day    = day;
    }

    /**
     * Get the year, month, and day of birth of a student
     * @return the year, month, and day of birth of a student in YYYY-MM-DD format
     */
    public String getYyMmDd()
    {
        return "" + year + "-" + month + "-" + day;
    }

    //Accessors and mutators

    /**
     * Get the year of birth of a student
     * @return the year of birth of a student
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Set the year of birth of a student
     * @return the year of birth of a student
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Access the month of birth of a student
     * @return the month of birth of a student
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Set the month of birth of a student
     * @param month the month of birth of a student
     */
    public void setMonth(int month)
    {
        this.month = month;
    }

    /**
     * Access the day of birth of a student
     * @return the day of birth of a student
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Set the day of birth of a student
     * @param day the day of birth of a student
     */
    public void setDay(int day)
    {
        this.day = day;
    }
}