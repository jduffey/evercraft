public class CharacterEntity {

    private String name;
    private AlignmentType alignmentType;
    private int armorRating = 10;
    private int hitPoints = 5;
    private int mostRecentRoll;
    private boolean mostRecentAttackSuccess;

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

    public boolean isMostRecentAttackSuccess() {
        return mostRecentAttackSuccess;
    }

    public boolean attack(CharacterEntity target, int setDieOutcome) {

        if (roll(setDieOutcome) < target.armorRating) {
            mostRecentAttackSuccess = false;
        } else
            mostRecentAttackSuccess = true;

        dealDamage(target);

        return mostRecentAttackSuccess;
    }

    private void dealDamage(CharacterEntity target) {
        if (mostRecentRoll == 20) {
            target.setHitPoints(-1);
        }
        target.setHitPoints(-1);
    }

    private void setHitPoints(int i) {
        hitPoints = hitPoints + i;
    }

    private int roll(int setOutcome) {
        mostRecentRoll = setOutcome;
        return mostRecentRoll;
    }
}
