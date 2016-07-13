package de.androbin.math.util.doubles;

import static de.androbin.collection.util.DoubleCollectionUtil.*;
import java.util.function.*;

public final class DoubleFunctionMathUtil
{
	private DoubleFunctionMathUtil()
	{
	}
	
	public static double add( final int n, final IntToDoubleFunction f )
	{
		double p = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			p += f.applyAsDouble( i );
		}
		
		return p;
	}
	
	public static double[] add( final int n, final IntToDoubleFunction f, final IntToDoubleFunction g )
	{
		return fill( new double[ n ], i -> f.applyAsDouble( i ) + g.applyAsDouble( i ) );
	}
	
	public static double avg( final int n, final IntToDoubleFunction f )
	{
		return add( n, f ) / n;
	}
	
	public static double multiply( final int n, final IntToDoubleFunction f )
	{
		double p = 1;
		
		for ( int i = 0; i < n; i++ )
		{
			p *= f.applyAsDouble( i );
		}
		
		return p;
	}
	
	public static double[] sub( final int n, final IntToDoubleFunction f, final IntToDoubleFunction g )
	{
		return fill( new double[ n ], i -> f.applyAsDouble( i ) - g.applyAsDouble( i ) );
	}
}