package demo_java_app.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    private App word;

    @BeforeEach
    public void obj(){
        this.word = new App();
    }

    @DisplayName("Begins with a g")
    @ParameterizedTest(name = "str={0},result={1}")
    @CsvSource({"g,false","gg,true","ggg,true","gx,false","ggx,true","gggx,true"})
    public void BeignsWithAg(String str, Boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result,ans);
    }

    @DisplayName("Ends with a g")
    @ParameterizedTest(name = "str={0},result={1}")
    @CsvSource({"gxg,false","g,false","ggxg,false","gggxxxxgxxxg,false"})
    public void EndsWithAg(String str, boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result,ans);
    }


    @DisplayName("Randomly placed Gs")
    @ParameterizedTest(name="str={0},result={1}")
    @CsvSource({"calhdggkj,true","sgsjdgggskj,false","kjsaggglks,true","akjasgklas,false"})
    public void RandomlyPlacedG(String str, Boolean result){
        Boolean ans = word.gHappy(str);
        Assertions.assertEquals(result, ans);
    }
     
}
