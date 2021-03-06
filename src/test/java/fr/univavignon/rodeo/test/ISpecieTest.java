package fr.univavignon.rodeo.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {
	
	
	private static List<IAnimal> animalsList;
	public static ISpecie getTestInstanceStatic(int area) {
		
		ISpecie specieMock = Mockito.mock(ISpecie.class);
		Mockito.when(specieMock.getArea()).thenReturn(area);
		
		animalsList = new LinkedList<IAnimal>();
		animalsList.add(IAnimalTest.getTestInstanceStatic(2, true, false, false));
		animalsList.add(IAnimalTest.getTestInstanceStatic(4, true, true, false));
		
		Mockito.when(specieMock.getAnimals()).thenReturn(animalsList);
		
		return specieMock;
	}
	protected ISpecie getTestInstance() {
		
		return getTestInstanceStatic(3);
	
	}
	
	@Test
	public void testGetArea() {
		ISpecie test = getTestInstance();
		assertEquals(test.getArea(),3);
	}
	
	@Test
	public void testGetAnimals() {
		ISpecie test = getTestInstance();
		assertEquals(test.getAnimals(),animalsList);
	}
}
