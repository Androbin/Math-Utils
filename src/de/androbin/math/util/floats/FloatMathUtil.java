package de.androbin.math.util.floats;

public final class FloatMathUtil
{
	private FloatMathUtil()
	{
	}
	
	public static float avg( final float a, final float b, final float c )
	{
		return b + ( a - b ) / (float) Math.exp( Math.abs( a - b ) * c );
	}
	
	public static float bound( final float l, final float v, final float r )
	{
		return v <= l ? l : v >= r ? r : v;
	}
	
	public static int floor( final float f )
	{
		return f >= 0f ? (int) f : (int) f - 1;
	}
	
	public static float interpolate( final float l, final float p, final float r )
	{
		return l + p * ( r - l );
	}
	
	public static float max( final float a, final float b )
	{
		return a >= b ? a : b;
	}
	
	public static float min( final float a, final float b )
	{
		return a <= b ? a : b;
	}
	
	public static float modulo( final float a, final float b )
	{
		return shiftUp( a % b, b );
	}
	
	public static int round( final float a )
	{
		return (int) ( a + 0.5f );
	}
	
	public static float shiftDown( final float a, final float b )
	{
		return a >= b ? a - b : a;
	}
	
	public static float shiftUp( final float a, final float b )
	{
		return a >= 0f ? a : a + b;
	}
}