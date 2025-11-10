public class PetAdoption implements Pet{
    Pet[] pets;
    public PetAdoption(){
        this.pets = new Pet[]{
                new Kitten(),
                new Puppy()
        };
    }

    @Override
    public void beAdopted(Person person){
        for(Pet p : pets){
            p.beAdopted(person);
        }
    }
}
