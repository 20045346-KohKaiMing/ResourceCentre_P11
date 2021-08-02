
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString2(){
		String output = super.toString();
		// Write your codes here
		
		return String.format("%-63s %-20d", output, getOs());
	}
}


