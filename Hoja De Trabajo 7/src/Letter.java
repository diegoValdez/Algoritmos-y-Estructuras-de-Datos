
public class Letter implements Comparable<Letter> {
	
	private int times;
	private String thisChar;
	private String code;
	
	public Letter(int times, String thisChar) {
		this.times = times;
		this.thisChar = thisChar;
		this.code ="";
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getThisChar() {
		return thisChar;
	}

	public void setThisChar(String thisChar) {
		this.thisChar = thisChar;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Letter [times=" + times + ", thisChar=" + thisChar + "]";
	}

	@Override
	public int compareTo(Letter o) {
		if (o.getTimes()<this.times) return -1;
		else if (o.getTimes()>this.times) return 1;
		else return 0;
	}
	
	public boolean equals(Object o){
		if (this.thisChar.equals(((Letter) o).getThisChar())) return true;
		else return false;
	}
	
	public void plusOne(){
		this.times++;
	}
}
