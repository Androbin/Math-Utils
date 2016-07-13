package de.androbin.math.util.ints;

import static de.androbin.math.util.ints.IntMathUtil.*;

public final class IntUnpairingUtil
{
	private IntUnpairingUtil()
	{
	}
	
	public static int uncantor( final int i )
	{
		return (int) ( -1 + Math.sqrt( 1 + ( i << 3 ) ) ) >> 1;
	}
	
	public static int uncantorA( final int i, final int z )
	{
		return ( z * ( 3 + z ) >> 1 ) - i;
	}
	
	public static int uncantorA2( final int i, final int z )
	{
		return sign( uncantorA( i, z ) );
	}
	
	public static int uncantorB( final int i, final int z )
	{
		return i - ( z * ( 1 + z ) >> 1 );
	}
	
	public static int uncantorB2( final int i, final int z )
	{
		return sign( uncantorB( i, z ) );
	}
}