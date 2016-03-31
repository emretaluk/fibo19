package Taluk;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.*;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;
public class Mock{

	@Test
	public void test() {
	NamedThing nt = mock(NamedThing.class);
	when(nt.getName()).thenReturn("Emre");
	assertEquals("Emre",nt.getName());
	}

	@Test(expected= throw IllegalArgumentException)
	public void setNameTest(){
		NamedThing nt = mock(NamedThing.class);
		when(nt.setName(name).thenReturn("Emre");
		assertEquals("Emre",nt.setName(name));
	}
}

