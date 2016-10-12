package algoSimba;

/**
 * This class represents a UtilityTuple used in the mHUIMiner algorithm
 * It is essentially the same as the Element of a utility list as used by the HUI-Miner algorithm.
 * 
 * @see AlgoSimba
 * @see UtilityList
 * @author Philippe Fournier-Viger, modified by Alex Peng
 */
public class UtilityTuple {
	// these properties should never be changed once instantiated
	/** transaction id */
	private final int tid;
	/** itemset utility */
	private final int iutils;
	/** remaining utility */
	private final int rutils;

	/**
	 * Constructor.
	 * 
	 * @param tid
	 *            the transaction id
	 * @param iutils
	 *            the itemset utility
	 * @param rutils
	 *            the remaining utility
	 */
	public UtilityTuple(int tid, int iutils, int rutils) {
		this.tid = tid;
		this.iutils = iutils;
		this.rutils = rutils;
	}

	public int getTid() {
		return tid;
	}

	public int getIutils() {
		return iutils;
	}

	public int getRutils() {
		return rutils;
	}
}
