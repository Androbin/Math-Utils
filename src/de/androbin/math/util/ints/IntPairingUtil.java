package de.androbin.math.util.ints;

import static de.androbin.math.util.ints.IntMathUtil.*;

public final class IntPairingUtil
{
	private IntPairingUtil()
	{
	}
	
	public static int cantor( final int a, final int b )
	{
		final int xy = a + b;
		return ( xy * ( xy + 1 ) >> 1 ) + b;
	}
	
	public static int cantor2( final int a, final int b )
	{
		return cantor( unsign( a ), unsign( b ) );
	}
	
	public static int cantor3( final int a, final int b )
	{
		return sign( cantor2( a, b ) );
	}
	
	public static int commutative( final int a, final int b )
	{
		return a >= b ? ( a * ( a + 1 ) >> 1 ) + b : ( b * ( b + 1 ) >> 1 ) + a;
	}
	
	public static int commutative2( final int a, final int b )
	{
		assert a != b;
		return a > b ? ( ( a - 1 ) * a >> 1 ) + b : ( ( b - 1 ) * b >> 1 ) + a;
	}
	
	public static int szudzik( final int a, final int b )
	{
		return a >= b ? a * a + a + b : a + b * b;
	}
	
	public static int szudzik2( final int a, final int b )
	{
		return szudzik( unsign( a ), unsign( b ) );
	}
	
	public static int szudzik3( final int a, final int b )
	{
		return sign( szudzik2( a, b ) );
	}
}