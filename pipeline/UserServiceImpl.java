package pipeline;

public class UserServiceImpl implements UserSerivice{
    UserRepository repository;
    public UserServiceImpl() {
        this.repository = UserRepository.getInstance();
    }
    private static UserServiceImpl instance = new UserServiceImpl();
    public static UserServiceImpl getInstance() {
        return instance;
    }
    @Override
    public void findUsers() {
        repository.findUser();

    }
}
