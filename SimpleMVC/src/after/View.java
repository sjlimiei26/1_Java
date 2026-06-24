package after;

public class View {
	
	private Controller controller;
	
	public View() {
		this.controller = new Controller(); 
	}
	
	public void display() {
		
		String result = controller.getInfo();
		
		System.out.println(result);
		
	}

}
