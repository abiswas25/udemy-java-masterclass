
public class FlourPacker {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0 || goal > ((bigCount * 5) + (smallCount * 1))) {
			return false;
		}
		
		int reqBigCount = 0;
		int reqSmallCount = 0;
		int bigFromSmallCount = 0;
		
		reqSmallCount += goal % 5;
		goal -= goal % 5;
		bigFromSmallCount = (smallCount - reqSmallCount) / 5;
		bigCount += bigFromSmallCount;
		smallCount -= bigFromSmallCount * 5;
		reqBigCount += goal / 5;
			
		if(reqBigCount <= bigCount && reqSmallCount <= smallCount) {
			return true;
		}
		return false;
	}

}
