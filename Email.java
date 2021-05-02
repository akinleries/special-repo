package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength;
    private int mailBoxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email created :" + " " + this.firstName + " " + this.lastName);

        this.department = setDepartment();

        System.out.println("Department : " + this.department);
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is :" + this.password);
    }

    public String setDepartment(){
        System.out.println("Department Codes \n enter 1 for sales \n enter 2 for accounting \n enter 3 for development \n enter 0 for none");
        Scanner scanner = new Scanner(System.in);
        int userCode = scanner.nextByte();
        if (userCode == 1){
            return "you are in sales department";
        }
        else if(userCode == 2){
            return "you are in accounting department";
        }
        else if(userCode == 3){
            return "you are in development team";
        }
        return " ";
    }
    private String randomPassword(int length){
        String setPassword = "efpestijfmestmemqopwow";
        char[] password = new char[length];
        for(int count = 1; count < length; count++){
            int rand = (int) Math.random() * setPassword.length();
            password[count] = setPassword.charAt(rand);

        }
        return new String(password);
    }
}
