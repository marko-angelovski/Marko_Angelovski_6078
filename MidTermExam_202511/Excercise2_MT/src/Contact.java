public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public boolean isProfessionalEmail(){
        String[] emailParts = email.split("@");
        if (emailParts[1].equals("work.com")){
            return true;
        }
        else{
            return false;
        }

    }
    public void displayContactInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println();
    }

}
