public class Main {
    public static void main(String[] args) {

        Contact[] contacts = {
                new Contact("Alice Anderson","555-1234","alice@gmail.com"),
                new Contact("Bob Brown","555-5678","bob.brown@work.com"),
                new Contact("Charlie Clark","555-4321","charlie@gmail.com"),
                new Contact("David Davis","555-4321", "david.davis@work.com"),
                new Contact("Evee Evans", "555-9999","eve@work.com"),
                new Contact("Marko Angelovski", "555-9995","marko@work.com"),
                new Contact("Bojan Zivkovich", "555-9993","bojan@gmail.com"),


        };

        int sum = 0;
        System.out.println("All Contacts: ");
        for (Contact contact: contacts){
            contact.displayContactInfo();
            if(contact.isProfessionalEmail()){
                sum+=1;
            }

        }
        System.out.println("The number of professional contacts is " + sum);




    }
}
