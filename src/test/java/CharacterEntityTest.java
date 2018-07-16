import org.junit.Assert;
import org.junit.Test;

public class CharacterEntityTest {

    @Test
    public void shouldSetAndGetName() {
        CharacterEntity character = new CharacterEntity();
        character.setName("Riley");
        Assert.assertEquals("Riley", character.getName());
    }

    @Test
    public void shouldSetAndGetAlignment() {
        CharacterEntity character = new CharacterEntity();
        character.setAlignment(AlignmentType.GOOD);
        Assert.assertEquals(AlignmentType.GOOD, character.getAlignment());
    }

    @Test
    public void goodNeutralAndEvilAlignmentsExist(){
        Assert.assertNotNull(AlignmentType.GOOD);
        Assert.assertNotNull(AlignmentType.NEUTRAL);
        Assert.assertNotNull(AlignmentType.EVIL);
    }

}
