
public class Item {

	private int vnum;
	private int type;
	private String description;
	
	public Item() {
		
	}
	public Item( int num, int num2 ) {
		 this.vnum = num;
		 this.type = num2;
	}
	 
	public Item( int num, int num2, String arg ) {
		 this.vnum = num;
		 this.type = num2;
		 this.description = arg;
	}
	
	public int getVnum() {
		return vnum;
	}
	
	public int getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean setVnum( int num) {
		if( this.vnum == 0 ) {
			this.vnum = num;
			return true;
		} else {
			return false;
		}
	}
	
	public void setType( int num ) {
		this.type = num;
	}
	
	public void setDescription( String arg ) {
		this.description = arg;
	}
	
	public boolean hasType( int num ) {
		if( this.type == num ) {
			return true;
		} else {
			return false;
		}
	}
	
	public String showItem() {
		return "vnum: " + vnum + " type: " + type;
	}
	
}
