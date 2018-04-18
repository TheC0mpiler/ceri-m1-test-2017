package fr.univavignon.rodeo.test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {
	private static IGameState gameState;
	public static IGameStateProvider getTestInstanceStatic() {
		IGameStateProvider gameStateProvider = Mockito.mock(IGameStateProvider.class);
		gameState = IGameStateTest.getTestInstanceStatic();
		Mockito.when(gameStateProvider.get("name")).thenReturn(gameState);
		Mockito.when(gameStateProvider.get(null)).thenThrow(new IllegalArgumentException());
		return gameStateProvider;
	}

	protected IGameStateProvider getTestInstance() {
		return getTestInstanceStatic();
	}
	
	public void testGet() {
		IGameStateProvider test = getTestInstance();
		assertEquals(test.get("name"),gameState);
	}
}
