package de.androbin.math.util.ints;

import static de.androbin.collection.util.IntegerCollectionUtil.*;
import java.util.function.*;

public final class IntFunctionConcurrentMathUtil
{
	private IntFunctionConcurrentMathUtil()
	{
	}
	
	public static int[] addAllParallel( final int n, final IntUnaryOperator f, final IntUnaryOperator g )
	{
		return fillParallel( new int[ n ], i -> f.applyAsInt( i ) + g.applyAsInt( i ) );
	}
	
	public static int[] subAllParallel( final int n, final IntUnaryOperator f, final IntUnaryOperator g )
	{
		return fillParallel( new int[ n ], i -> f.applyAsInt( i ) - g.applyAsInt( i ) );
	}
}