public class CharacterEntity {

    private String name;
    private AlignmentType alignmentType;
    private int armorRating = 10;
    private int hitPoints = 5;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlignment(AlignmentType alignment) {
        this.alignmentType = alignment;
    }

    public AlignmentType getAlignment() {
        return alignmentType;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
