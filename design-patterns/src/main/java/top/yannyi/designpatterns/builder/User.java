package top.yannyi.designpatterns.builder;

public class User {
    private String firstName;
    private String lastName;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
class Main{

    public static void main(String[] args) {
        new User.UserBuilder().withFirstName("11").withLastName("22");
    }
}
