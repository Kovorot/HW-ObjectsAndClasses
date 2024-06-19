import java.util.Objects;

public class Author {
    private String firstname;
    private String lastname;

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return author.firstname.equals(this.firstname) && author.lastname.equals(this.lastname);
    }

    @Override
    public String toString() {
        return "Имя " + firstname + ", фамилия " + lastname;
    }
}
