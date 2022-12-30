package exer.exer5;

public class Tools {


    /**
     *注册
     * @param username 用户名
     * @param password 密码
     */
    public static void register(String username,String password){

       /* try{*/
            UserManager um = new UserManager();
            um.add(new User(username,password));
            System.out.println("注册成功");
        /*}catch (UsernameAlreadyExistsException e){
            System.out.println(e.getMessage());
        }*/
    }

    public static void logIn(String username,String password){
        try{
            UserManager um = new UserManager();
            um.login(new User(username,password));
            System.out.println("登录成功");
        }catch (LoginFailException e){
            System.out.println(e.getMessage());
        }
    }
}
