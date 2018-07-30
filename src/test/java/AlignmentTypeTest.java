import org.junit.Assert;
import org.junit.Test;

public class AlignmentTypeTest {

    @Test
    public void alignmentTypesShouldExist(){
        Assert.assertNotNull(AlignmentType.EVIL);
        Assert.assertNotNull(AlignmentType.NEUTRAL);
        Assert.assertNotNull(AlignmentType.GOOD);
    }

}
