// Concrete Factory for Professional Garments
public class ProfessionalFactory implements Factory {
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }

    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
