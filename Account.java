
public class Account {
    private double balance;
    public Account(){
        balance = 0;
    }
    public double getbalance(){
        return balance;
    }
    public boolean withdraw(int money){
        if(money<=0 || money>balance){
            return false;
        }else{
            balance-=money;
            return true;
        }
    }
    public boolean deposit(int money){
        if(money<=0){
            return false;
        }else{
            balance+=money;
            return true;
        }
    }

}
