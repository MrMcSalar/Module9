// Main class which tests pattern
public class Main {
    public static void main(String[] args) {

        // Creates a factory for Professional clothes
        // People will get mad if they receive non-matching garments so all garments in each group are grouped together to match
        // Each factory produces a variant of clothing, this structure can keep up with new clothing releases while ensuring no customer gets mixed up variants
        // of clothing
        Factory professionalFactory = new ProfessionalFactory();
        Top professionalTop = professionalFactory.createTop();
        Pant professionalPant = professionalFactory.createPant();
        Shoe professionalShoe = professionalFactory.createShoe();

        professionalTop.wear();
        professionalPant.wear();
        professionalShoe.wear();
        System.out.println("\n");

        // Creates a factory for Casual clothes
        Factory casualFactory = new CasualFactory();

        Top casualTop = casualFactory.createTop();
        Pant casualPant = casualFactory.createPant();
        Shoe casualShoe = casualFactory.createShoe();
        casualTop.wear();
        casualPant.wear();
        casualShoe.wear();
        System.out.println("\n");

        // Creates a factory for Party clothes
        Factory partyFactory = new PartyFactory();

        Top partyTop = partyFactory.createTop();
        Pant partyPant = partyFactory.createPant();
        Shoe partyShoe = partyFactory.createShoe();
        partyTop.wear();
        partyPant.wear();
        partyShoe.wear();
    }
}
