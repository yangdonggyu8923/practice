package pipeline;

public class UserController {
    UserServiceImpl userService;

    public UserController() {
        this.userService = UserServiceImpl.getInstance();
    }

    public void findUsers() {
        userService.findUsers();
    }
}
