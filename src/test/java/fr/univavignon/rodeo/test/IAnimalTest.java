package fr.univavignon.rodeo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {
	
	
	public static IAnimal getTestInstanceStatic(int getXP, boolean isSecret, boolean isEndangered, boolean isBoss) {
		IAnimal animalMock = Mockito.mock(IAnimal.class);
		Mockito.when(animalMock.getXP()).thenReturn(getXP);
		Mockito.when(animalMock.isSecret()).thenReturn(isSecret);
		Mockito.when(animalMock.isEndangered()).thenReturn(isEndangered);
		Mockito.when(animalMock.isBoss()).thenReturn(isBoss);
		return animalMock;
	}
	
	protected IAnimal getTestInstance() {
		return getTestInstanceStatic(3,true,true,true);
	}
	
	@Test
	public void testGetXP() {
		IAnimal test = getTestInstance();
		assertEquals(test.getXP(),3);
	}
	
	@Test
	public void testIsSecret() {
		IAnimal test = getTestInstance();
		assertEquals(test.isSecret(),true);
	}
	
	@Test
	public void testIsEndangered() {
		IAnimal test = getTestInstance();
		assertEquals(test.isEndangered(),true);
	}
	
	@Test
	public void testIsBoss() {
		IAnimal test = getTestInstance();
		assertEquals(test.isBoss(),true);
	}
}
