import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 100;
    private String email;
    private String alternateEmail;
    private String companyName = "mycompany";

    // Constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email Created Successfully : " + firstName + " " +
        // lastName);

        // call a method asking for the department
        this.department = setDepartment();
        // System.out.println("Department : " + this.department);

        // call a method return a random password
        this.password = randomPassword(10);
        // System.out.println("Password : " + this.password);

        // Generate an email using the first name and last name and department
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
        // System.out.println("the email is : " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print(
                "New WOrker : " + firstName + ","
                        + "Department Codes:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEneter the Department Code :");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "none";
        }
    }

    // Generate the random password
    private String randomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()+=";
        char[] pass = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(rand);
        }
        return new String(pass); // convert array to string do we can call
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int Capacity) {
        this.mailboxCapacity = Capacity;
    }

    // Set the alternate email address
    public void setAlternateEmail(String alterEmail) {
        this.alternateEmail = alterEmail;
    }

    // change the password
    public void setNewPassword(String newPass) {
        this.password = newPass;
    }

    // get mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // get the alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // get the password
    public String getNewPassword() {
        return password;
    }

    public String showInfo() {
        return "Your Name: " + firstName + " " + lastName +
                "\nDepartment: " + department +
                "\nEmail: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb" +
                "\nPassword: " + password;
    }

}