import org.junit.Assert;
import org.junit.Test;

public class LifeStatusTest {

    @Test
    public void lifeStatusesShouldExist(){
        Assert.assertNotNull(LifeStatus.ALIVE);
        Assert.assertNotNull(LifeStatus.DEAD);
    }

}
