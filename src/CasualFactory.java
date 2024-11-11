// Concrete Factory for Casual Garments
public class CasualFactory implements Factory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pant createPant() {
        return new CasualPant();
    }

    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
