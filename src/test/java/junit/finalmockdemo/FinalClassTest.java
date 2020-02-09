package junit.finalmockdemo;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

import com.IncludeTest;

@Category(IncludeTest.class)
@RunWith(PowerMockRunner.class)
public class FinalClassTest {

	@Mock
	FinalClass finalclass;
	@Test
	public void finalMethod()
	{
		 Mockito.when(finalclass.finalMethod()).thenReturn("not anymore");

		// assertThat(mock.finalMethod()).isNotEqualTo(concrete.finalMethod());
	}
}
