import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FilineTest {
    @Test
    public void eatMeatTest() throws Exception {
        //Arrange
        Feline feline = new Feline();
        var expectedResult = List.of("Животные", "Птицы", "Рыба");
        //Act
        var actualResult = feline.eatMeat();
        //Assert
        Assert.assertEquals("Incorrect", expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        //Arrange
        Feline feline = new Feline();
        var expectedResult = "Кошачьи";
        //Act
        var actualResult = feline.getFamily();
        //Assert
        Assert.assertEquals("Incorrect", expectedResult, actualResult);
    }

    @Test
    public void getDefaultKittensTest() {
        //Arrange
        Feline feline = new Feline();
        var expectedResult = 1;
        //Act
        var actualResult = feline.getKittens();
        //Assert
        Assert.assertEquals("Incorrect", expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        //Arrange
        Feline feline = new Feline();
        var expectedResult = 5;
        //Act
        var actualResult = feline.getKittens(5);
        //Assert
        Assert.assertEquals("Incorrect", expectedResult, actualResult);
    }
}
