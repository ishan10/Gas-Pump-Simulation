import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fuel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fuel extends LeafDecorator
{
    /**
     * Act - do whatever the fuel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    	private String[] options;
	private Double Quantity;

	public fuel(String d) {
		super(d);
		
	}
	
	public void setQuantity(Double a){
		this.Quantity = a;
	}

	public void setOptions(String[] options) {
		// 1 sauce free, extra +.75
		this.options = options;
/*		if (options.length > 1)
			this.price += (options.length - 1) * 0.75;
*/	
/*		System.out.println(this.options[0]);
		System.out.println(this.price);*/
		if(this.options[0].equalsIgnoreCase("87")){
			this.price += Quantity  * 2.929;	
			
		} else if(this.options[0].equalsIgnoreCase("89")){
			this.price += Quantity  * 3.129	;
			
		} else if(this.options[0].equalsIgnoreCase("93")){
			this.price += Quantity  * 3.329;	
			
		}
	}

	public String getDescription() {
		String desc = "";
		for (int i = 0; i < options.length; i++) {
			if (i > 0)
				desc += " + " + options[i];
			else
				desc = options[i];
		}
		return desc;
	}
}