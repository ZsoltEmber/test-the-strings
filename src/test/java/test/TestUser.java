package test;

public class TestUser {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final String password;

    public TestUser(String firstName, String lastName, String username, String password) {
        this.id = System.currentTimeMillis();
        this.firstName = firstName + id;
        this.lastName = lastName + id;
        this.username = username + id;
        this.email = username + "@email.com";
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
