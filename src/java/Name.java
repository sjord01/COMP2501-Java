/**
 * Records the first and last name of a student
 *
 * @author ross & sam ordonez
 * @version 1.0
 */
public class Name
{
    private String firstName;
    private String lastName;

    /**
     * @param firstName the first name of a student
     * @param lastName the last name of a student
     */
    public Name(final String firstName,
                final String lastName)
    {
        this.firstName  = firstName;
        this.lastName   = lastName;
    }

    /**
     * Get the full name of a student
     * @return full name of a student
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Get the initials of the first and last name of a student
     * @return the initials of the first and last name of a student
     */
    public String getInitials()
    {
        return firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";
    }

    //Accessors and mutators

    /**
     *Access the first name of a student
     * @return the first name of a student
     */
    public String getFirst()
    {
        return firstName;
    }

    /**
     * Set the first name of a student
      * @param firstName the first name of a student
     */
    public void setFirst(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Access the last name of a student
     * @return the last name of a student
     */
    public String getLast()
    {
        return lastName;
    }

    /**
     * Set the last name of a student
     * @param lastName the last name of a student
     */
    public void setLast(String lastName)
    {
        this.lastName = lastName;
    }
}
