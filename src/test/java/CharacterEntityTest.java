import org.junit.Assert;
import org.junit.Test;

public class CharacterEntityTest {

    @Test
    public void characterShouldSetAndGetName() {
        CharacterEntity character = new CharacterEntity();
        character.setName("Riley");
        Assert.assertEquals("Riley", character.getName());
    }

    @Test
    public void characterShouldSetAndGetAlignment() {
        CharacterEntity character = new CharacterEntity();
        character.setAlignment(AlignmentType.GOOD);
        Assert.assertEquals(AlignmentType.GOOD, character.getAlignment());
    }

    @Test
    public void goodNeutralAndEvilAlignmentsExist() {
        Assert.assertNotNull(AlignmentType.GOOD);
        Assert.assertNotNull(AlignmentType.NEUTRAL);
        Assert.assertNotNull(AlignmentType.EVIL);
    }

    @Test
    public void characterShouldHaveADefaultArmorRatingOf10() {
        CharacterEntity character = new CharacterEntity();
        Assert.assertEquals(10, character.getArmorRating());
    }

    @Test
    public void characterShouldHaveDefaultHitPointsOf5() {
        CharacterEntity character = new CharacterEntity();
        Assert.assertEquals(5, character.getHitPoints());
    }

    @Test
    public void characterAttackFailsWhenRollIsLessThanOpponentArmorRating() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(10, badGuy.getArmorRating());
        goodGuy.attack(badGuy, 9);
        Assert.assertEquals(false, goodGuy.isMostRecentAttackSuccess());
    }

    @Test
    public void characterAttackSucceedsWhenRollIsGreaterThanOpponentArmorRating() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(10, badGuy.getArmorRating());
        goodGuy.attack(badGuy, 11);
        Assert.assertEquals(true, goodGuy.isMostRecentAttackSuccess());
    }

    @Test
    public void characterAttackSucceedsWhenRollIsEqualToOpponentArmorRating() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(10, badGuy.getArmorRating());
        goodGuy.attack(badGuy, 10);
        Assert.assertEquals(true, goodGuy.isMostRecentAttackSuccess());
    }

    @Test
    public void successfulAttackTakesOneHitPointFromOpponent() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(5, badGuy.getHitPoints());
        Assert.assertEquals(10, badGuy.getArmorRating());
        goodGuy.attack(badGuy, 11);
        Assert.assertEquals(4, badGuy.getHitPoints());
    }

    @Test
    public void anAttackRollOf20DealsTwoPointsOfDamage() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(5, badGuy.getHitPoints());
        Assert.assertEquals(10, badGuy.getArmorRating());
        goodGuy.attack(badGuy, 20);
        Assert.assertEquals(3, badGuy.getHitPoints());
    }

    @Test
    public void aCharacterIsCreatedWithStatusAlive() {
        CharacterEntity character = new CharacterEntity();
        Assert.assertEquals(LifeStatus.ALIVE, character.getLifeStatus());
    }

    @Test
    public void fiveHitPointsOfDamageMakeACharacterDead() {
        CharacterEntity goodGuy = new CharacterEntity();
        CharacterEntity badGuy = new CharacterEntity();
        Assert.assertEquals(5, badGuy.getHitPoints());
        goodGuy.attack(badGuy, 20);
        goodGuy.attack(badGuy, 20);
        Assert.assertEquals(1, badGuy.getHitPoints());
        goodGuy.attack(badGuy, 19);
        Assert.assertEquals(0, badGuy.getHitPoints());
        Assert.assertEquals(LifeStatus.DEAD, badGuy.getLifeStatus());
    }

    @Test
    public void allCharactersHaveStrengthDexterityConstitutionWisdomIntelligenceCharismaDefaultValues() {
        CharacterEntity character = new CharacterEntity();
        Assert.assertEquals(10, character.getStrength());
        Assert.assertEquals(10, character.getDexterity());
        Assert.assertEquals(10, character.getConstitution());
        Assert.assertEquals(10, character.getWisdom());
        Assert.assertEquals(10, character.getIntelligence());
        Assert.assertEquals(10, character.getCharisma());
    }

}
