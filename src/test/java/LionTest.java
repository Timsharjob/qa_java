import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class LionTest {
    Feline feline = Mockito.mock(Feline.class);

    @Test(expected = Exception.class)
    public void hasManeLionExceptionTest() throws Exception {
        //Arrange
        //Act
        //Assert
        Lion lion = new Lion("Самк", feline);
    }


    @Test
    public void getKittensTest() throws Exception {
        //Arrange
        Mockito.when(feline.getKittens()).thenReturn(1);
        var expectedResult = 1;
        Lion lion = new Lion("Самец", feline);
        //Act
        var actualResult = lion.getKittens();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        //Arrange
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", feline);
        //Act
        var actualResult = lion.getFood();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
