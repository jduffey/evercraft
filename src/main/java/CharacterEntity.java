public class CharacterEntity {

    private String name;
    private AlignmentType alignmentType;

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
}
