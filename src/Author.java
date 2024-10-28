public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + ' ' + lastName;
    }

    public boolean equals(Author comparable) {
        if (this == comparable) {
            return true;
        }
        if (this.getClass() != comparable.getClass() || comparable == null) {
            return false;
        }
        return firstName.equals(comparable.firstName) && lastName.equals(comparable.lastName);
    }

    public int hashCode() {
        int result = firstName == null ? 0 : firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
