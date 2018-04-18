package fr.univavignon.rodeo.test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameState;

public class IGameStateTest {
	
	
	public static IGameState getTestInstanceStatic() {
		
		IGameState gameState = Mockito.mock(IGameState.class);
		Mockito.doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(null);
		Mockito.when(gameState.getProgression()).thenReturn(5);
		return gameState;
		
	}
	
	protected IGameState getTestInstance() {
		return getTestInstanceStatic();
	}
	
	public void testGetProgression() {
		IGameState test = getTestInstance();
		assertEquals(test.getProgression(),5);
	}
}
