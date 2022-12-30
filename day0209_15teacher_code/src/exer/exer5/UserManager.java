package exer.exer5;

public class UserManager {
    private static User[] arr = new User[2]; //存储已经注册的用户
    private static int total;//存储实际注册的用户数量

    private  static User[] newArr;
    public UserManager() {
    }

    public void checkUsernameExits(String username) throws UsernameAlreadyExistsException {
        if (total < arr.length) {
            for (int i = 0; i < total; i++) {
                if (username.equals(arr[i].getUsername())) {
                    throw new UsernameAlreadyExistsException("用户名已存在,请重新注册：");
                }
            }
        } else {
            for (int i = arr.length; i <= newArr.length; i++) {
                if (username.equals(newArr[i].getUsername())) {
                    throw new UsernameAlreadyExistsException("用户名已存在,请重新注册：");
                }
            }


        }
    }

    public void add(User user) /*throws UsernameAlreadyExistsException*/ {
        /*checkUsernameExits(user.getUsername());*/
        if (total >= arr.length) {
            newArr = new User[arr.length + (arr.length >> 2)];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[total++] = user;
        }
        arr[total++] = user;
    }

    public void login(User user) throws LoginFailException {
        int index = 0;
        for (int i = 0; i < total; i++) {
            if (arr[i].getUsername().equals(user.getUsername()) && arr[i].getPassword().equals(user.getPassword())) {
                index++;
            }
        }
        if (index == 0) {
            throw new LoginFailException("登陆失败异常，账号密码错误");
        }
    }

    public static void arrLook() {
        /*for(User x: arr){
            System.out.println(x.toString());//使用fori循环比较好，避免空指针异常
        }*/

        for (int i = 0; i < total; i++) {
            System.out.println(arr[i].toString());
        }
    }

}