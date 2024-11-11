// Concrete Factory for Party Garments
public class PartyFactory implements Factory {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pant createPant() {
        return new PartyPant();
    }

    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
