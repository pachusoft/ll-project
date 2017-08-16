import com.ll.persistance.CaseDto;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;


@TestComponent
public class CaseTest {

    CaseDto tester = new CaseDto();

    //Test for sayHello
    @Test
    public void testSayHello(){
        Assert.assertEquals("hello frm DTO",tester.sayHello());
    }
}
