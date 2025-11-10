public class Runner {
    public void run(){
        PetAdoption center = new PetAdoption();

        Person volunteer = new Volunteer();
        Person guest = new Guest();

        System.out.println("Volunteer saves pets...");
        center.beAdopted(volunteer);

        System.out.println("Guest saves pets...");
        center.beAdopted(guest);
    }
}
