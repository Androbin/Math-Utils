package de.androbin.math.util.longs;

public final class LongMathUtil
{
	private LongMathUtil()
	{
	}
	
	public static long bound( final long l, final long v, final long r )
	{
		if ( v <= l )
		{
			return l;
		}
		else if ( v >= r )
		{
			return r;
		}
		else
		{
			return v;
		}
	}
	
	public static long min( final long ... i_ )
	{
		long min = Integer.MAX_VALUE;
		
		for ( final long i : i_ )
		{
			min = Math.min( min, i );
		}
		
		return min;
	}
	
	public static long max( final long ... i_ )
	{
		long max = Integer.MIN_VALUE;
		
		for ( final long i : i_ )
		{
			max = Math.max( max, i );
		}
		
		return max;
	}
	
	public static long modulo( final long a, final long b )
	{
		return shiftUp( a % b, b );
	}
	
	public static long moduloBinary( final long a, final long b )
	{
		return a & b - 1;
	}
	
	public static long rotate( final long a, final int b, final int c )
	{
		final int d = c % b;
		return moduloBinary( a << d | ( a >> b - d ), 1 << b );
	}
	
	public static long shiftDown( final long a, final long b )
	{
		return a >= b ? a - b : a;
	}
	
	public static long shiftUp( final long a, final long b )
	{
		return a >= 0L ? a : a + b;
	}
	
	public static long sign( final long a )
	{
		return ( a & 1 ) == 0 ? a >> 1 : -( a + 1 >> 1 );
	}
	
	public static long unsign( final long a )
	{
		return a >= 0 ? a << 1 : ( -a << 1 ) - 1;
	}
}