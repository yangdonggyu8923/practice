package pipeline;

public class UserRepository {
    private static UserRepository instance = new UserRepository();

    public static UserRepository getInstance() {
        return instance;
    }


    public void findUser() {
    }
}
