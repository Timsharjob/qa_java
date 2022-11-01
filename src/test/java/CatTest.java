import com.example.Cat;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Predator predator;

    @Test
    public void getSoundTest() {
        //Arrange
        Cat cat = new Cat(predator);
        var expectedResult = "Мяу";
        //Act
        var actualResult = cat.getSound();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        //Arrange
        Cat cat = new Cat(predator);
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        //Act
        var actualResult = cat.getFood();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
