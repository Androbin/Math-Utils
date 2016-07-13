package de.androbin.math.util.ints;

import java.util.*;
import java.util.concurrent.*;

public final class IntMathUtil
{
	private IntMathUtil()
	{
	}
	
	public static int bound( final int l, final int v, final int r )
	{
		return v <= l ? l : v >= r ? r : v;
	}
	
	public static int min( final int ... i_ )
	{
		int min = Integer.MAX_VALUE;
		
		for ( final int i : i_ )
		{
			min = Math.min( min, i );
		}
		
		return min;
	}
	
	public static int max( final int ... i_ )
	{
		int max = Integer.MIN_VALUE;
		
		for ( final int i : i_ )
		{
			max = Math.max( max, i );
		}
		
		return max;
	}
	
	public static int modulo( final int a, final int b )
	{
		return shiftUp( a % b, b );
	}
	
	public static int moduloBinary( final int a, final int b )
	{
		return a & b - 1;
	}
	
	public static int[] random( final Random random, final int m, final int n, final int ... e )
	{
		final int[] r = new int[ n ];
		
		for ( int i = 0; i < n; i++ )
		{
			r[ i ] = ( random == null ? ThreadLocalRandom.current() : random ).nextInt( m - e.length - i );
			
			for ( int j = 0; j < i; j++ )
			{
				if ( r[ i ] >= r[ j ] )
				{
					r[ i ]++;
				}
			}
		}
		
		for ( int i = 0; i < e.length; i++ )
		{
			for ( int j = 0; j < n; j++ )
			{
				if ( r[ j ] >= e[ i ] )
				{
					r[ j ]++;
				}
			}
		}
		
		return r;
	}
	
	public static int rotate( final int a, final int b, final int c )
	{
		final int d = c % b;
		return moduloBinary( a << d | ( a >> b - d ), 1 << b );
	}
	
	public static int shiftDown( final int a, final int b )
	{
		return a >= b ? a - b : a;
	}
	
	public static int shiftUp( final int a, final int b )
	{
		return a >= 0 ? a : a + b;
	}
	
	public static int sign( final int a )
	{
		return ( a & 1 ) == 0 ? a >> 1 : -( a + 1 >> 1 );
	}
	
	public static int unsign( final int a )
	{
		return a >= 0 ? a << 1 : ( -a << 1 ) - 1;
	}
}