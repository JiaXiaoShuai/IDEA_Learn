package exer.exer6;

public class UserManager {
    private static User[] arr ;
    private static int total;

    public UserManager(){
        arr = new User[2];
    }

    public void checkUsernameExists(String username) throws UsernameAlreadyExistsException {
        for (int i = 0; i < total; i++) {
            if(username.equals(arr[i].getUsername())){
                throw new UsernameAlreadyExistsException("用户名已存在");
            }
        }
    }

    public void add(User user){
        if(total>=arr.length){
            User[] newArr = new User[arr.length + (arr.length>>2)];
            for (int i = 0; i < total; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[total++] = user;
    }

    public void login(User user) throws LoginFailException {
        for (int i = 0; i < total; i++) {
            if(user.getUsername().equals(arr[i].getUsername()) && user.getPassword().equals(arr[i].getPassword())){
                return;
            }
        }
        throw new LoginFailException("登录失败");
    }
}

