public class MultiInheritance {
    public static void main(String[] args){
        Employee emp = new Employee();
    }

}

class Company{
    String name = "Rachi";
    int id = 4635;
    int account = 2872;

    void getName(){
        System.out.println("Name : "+ name);
    }

     void getId(){
        System.out.println("Id : "+ id);
    }
}

class Accounts extends Company {
    void getAccount(){
        System.out.println("Account: "+ account);
       
    }
}

class Employee extends Company{
     Employee(){
        super.getName();
        super.getId();
        super.getAccount();
        
    }
}