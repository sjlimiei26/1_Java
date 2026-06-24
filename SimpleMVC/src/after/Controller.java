package after;

public class Controller {

	// * Model 객체를 관리
	private Model model; // private Model model = new Model();
	
	public Controller() {
		this.model = new Model();
	}
	
	public String getInfo() {
		// "이름 : " + {name} 반환해야함
		if (model != null) {
			return "이름 : " + model.getName();
		} else {
			return "정보가 없습니다";
		}
	}
}
