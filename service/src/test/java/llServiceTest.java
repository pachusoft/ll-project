import com.ll.persistance.CaseDto;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.springframework.boot.test.context.TestComponent;
import com.ll.llservices.llService;

@TestComponent
public class llServiceTest {

    llService service = new llService();

    @Mock
    CaseDto mockDto = mock(CaseDto.class);

    @Test
    public void testLlService(){
        when(mockDto.sayHello()).thenReturn("hello frm DTO");
        service.setDto(mockDto);
        Assert.assertEquals("hello frm DTO",service.sayHello());
    }
}
