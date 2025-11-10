public class Kitten implements Pet{
    @Override
    public void beAdopted(Person person){
        person.adopt(this) ;
    }
}
