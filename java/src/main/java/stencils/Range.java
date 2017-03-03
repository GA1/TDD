package stencils;

// the class implements a range of integers and some basic operation on ranges
// throw IllegalArgumentException when a number is divided by 0;
public class Range {
		
	// Range(2, 5) covers integers: {2, 3, 4}
	// Range(3, 3) covers integers: {}
	// Range(2, 2) covers integers: {}
	// if startInclusive > endInclusive an illegal state exception should be returned
	public Range(int startInclusive, int endExclusive) {
		
	}
	
	public boolean isInRange(int toCheck) {
		return false;
	}
	
	// For example, the intersection of Range(0..3) and Range(2..4) is the Range(2..3)
	// the result should not affect the input ranges
	public Range intersection(Range that) {
		return null;
	}
	
	
	// this method might be helpful while testing
	// note that for example Range(2, 2) and Range(3, 3) stand for the same empty range
	public boolean equals(Object that) {
		if (that == null)
			return false;
		else if (this == that)
			return true;
		if (!(that instanceof Range))
			return false;
	    Range thatRange = (Range) that;
	    // other evaluations will be needed after adding internal variables
		return false;	
	}
	
//	This method is optional but might be helpful while testing
//	public String toString() {
//		return null;
//	}
	
}
