package interview;
import org.junit.Test;

public class TestTextAnalyzerB {
    TextAnalyzerB ta = new TextAnalyzerB();

    @Test
    public void test_company_1(){
        ta.analyzeText("vowels", "dedalus");
    }
    @Test
    public void test_company_2(){
        ta.analyzeText("consonants", "dedalus");    
    }
}
