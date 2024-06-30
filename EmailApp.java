public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Wick");

        // em1.setAlternateEmail("mmmohammedajmal7@gmail.com");
        // System.out.println("The Alternate Email :" + em1.getAlternateEmail());
        
        // em1.setMailboxCapacity(3000);
        // System.out.println("the new mailbox capacity :" + em1.getMailboxCapacity());
        
        // em1.setNewPassword("MakeYourselfBetter@82759");
        // System.out.println("The new password :" + em1.getNewPassword());

        System.out.println(em1.showInfo());
    }
}
