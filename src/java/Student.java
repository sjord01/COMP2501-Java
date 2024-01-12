/**
 * Parses student data and shows a record of it
 *
 * @author raaz & sam ordonez
 * @version 1.0
 */
public class Student
{
    private final Name firstAndLastName;
    private final String studentNumber;
    private final Date dateOfBirth;

    private boolean graduated;

    /**
     * @param firstAndLastName the first and last name of a student
     * @param studentNumber the unique number identification of a student
     * @param dateOfBirth the date of birth of a student in YYYY-MM-DD format
     * @param graduated True or False; tells if a student is graduated or not
     */
    public Student(final Name       firstAndLastName,
                   final String     studentNumber,
                   final Date       dateOfBirth,
                   final boolean    graduated)
    {
        this.firstAndLastName   = firstAndLastName;
        this.studentNumber      = studentNumber;
        this.dateOfBirth        = dateOfBirth;
        this.graduated          = graduated;
    }

    /**
     * Access the full name of a student
     * @return the full name of a student
     */
    public Name getName()
    {
        return firstAndLastName;
    }

    /**
     * Access the unique identification number of a student
     * @return the unique identification number of a student
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * Access the date of birth of a student
     * @return the date of birth of a student
     */
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public boolean isGraduated()
    {
        return graduated;
    }
}