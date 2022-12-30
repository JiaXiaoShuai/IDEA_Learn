package exer.exer3;
/*
如果serr语句不是第一行打印，那就在最后一行，如果是第一行打印，那所有的serr都在第一行打印
 */
public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account("111111",5000);
        try{
            a.withdraw(1000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.out.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款1000后，" + a.getBalance() );
        }

        try {
            a.withdraw(-5000);
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款-5000后，" + a.getBalance() );
        }

        try{
            a.withdraw(5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("取款失败," + e.getMessage());
        }finally {
            System.out.println("尝试取款5000后，" + a.getBalance() );
        }

        try{
            a.save(-5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.err.println("存款失败," + e.getMessage());
        }finally {
            System.out.println("尝试存款-5000后，" + a.getBalance() );
        }
        try{
            a.save(5000);
        }catch (Exception e) {
//            e.printStackTrace();
            System.out.println("存款失败," + e.getMessage());
        }finally {

            System.out.println("尝试存款5000后，" + a.getBalance() );
        }
    }
}
