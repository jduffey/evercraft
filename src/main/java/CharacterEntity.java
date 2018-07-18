public class CharacterEntity {

    private String name;
    private AlignmentType alignmentType;
    private int strengthRating = 10;
    private int dexterityRating = 10;
    private int constitutionRating = 10;
    private int wisdomRating = 10;
    private int intelligenceRating = 10;
    private int charismaRating = 10;
    private int armorRating = 10;
    private int hitPoints = 5;
    private LifeStatus lifeStatus = LifeStatus.ALIVE;

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
        target.setLifeStatus();
    }

    private void setLifeStatus() {
        if (hitPoints <= 0) {
            lifeStatus = LifeStatus.DEAD;
        }
    }

    private void setHitPoints(int i) {
        hitPoints = hitPoints + i;
    }

    private int roll(int setOutcome) {
        mostRecentRoll = setOutcome;
        return mostRecentRoll;
    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public int getStrength() {
        return strengthRating;
    }

    public int getDexterity() {
        return dexterityRating;
    }

    public int getConstitution() {
        return constitutionRating;
    }

    public int getWisdom() {
        return wisdomRating;
    }

    public int getIntelligence() {
        return intelligenceRating;
    }

    public int getCharisma() {
        return charismaRating;
    }
}
