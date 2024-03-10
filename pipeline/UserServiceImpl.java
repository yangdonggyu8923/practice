package pipeline;

public class UserServiceImpl implements UserSerivice{
    private static UserServiceImpl instance = new UserServiceImpl();
    public static UserServiceImpl getInstance() {
        return instance;
    }
    UserRepository repository;
    public UserServiceImpl() {
        this.repository = UserRepository.getInstance();
    }

    @Override
    public void findUsers() {
        repository.findUser();

    }
}
