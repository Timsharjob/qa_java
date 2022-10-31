import com.example.IFiline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionTest {
    IFiline iFiline = Mockito.mock(IFiline.class);

    @Test
    public void hasManeLionExceptionTest() {
        //Arrange
        var expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        //Act
        try {
            Lion lion = new Lion("Самк", iFiline);
        } catch (Exception ex) {
            var actualResult = ex.getMessage();
            //Assert
            Assert.assertEquals(expectedResult, actualResult);
        }
    }

    @Test
    public void getKittensTest() throws Exception {
        //Arrange
        Mockito.when(iFiline.getKittens()).thenReturn(1);
        var expectedResult = 1;
        Lion lion = new Lion("Самец", iFiline);
        //Act
        var actualResult = lion.getKittens();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        //Arrange
        Mockito.when(iFiline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var expectedResult = List.of("Животные", "Птицы", "Рыба");

        Lion lion = new Lion("Самец", iFiline);
        //Act
        var actualResult = lion.getFood();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
