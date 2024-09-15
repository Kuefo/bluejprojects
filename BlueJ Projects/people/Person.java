abstract class Person
{
    private String name;
    private int yearOfBirth;

    /**
     * Create a person with given name and age.
     */
    Person(String name, int yearOfBirth)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Set a new name for this person.
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Return the name of this person.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Set a new birth year for this person.
     */
    public void setYearOfBirth(int newYearOofBirth)
    {
        yearOfBirth = newYearOofBirth;
    }

    /**
     * Return the birth year of this person.
     */
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Object"
    {
        return "Name: " + name + "\n" +
               "Year of birth: " + yearOfBirth + "\n";
    }
}
