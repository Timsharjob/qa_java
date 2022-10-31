import com.example.IFiline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean isCorrect;
    IFiline iFiline = Mockito.mock(IFiline.class);

    public LionParameterizedTest(String sex, boolean isCorrect) {
        this.sex = sex;
        this.isCorrect = isCorrect;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void hasManeLionTest() throws Exception {
        //Arrange
        var expectedResult = isCorrect;
        Lion lion = new Lion(sex, iFiline);
        //Act
        var actualResult = lion.doesHaveMane();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}

