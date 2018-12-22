package userdefineException;
/**
 * 自定义异常类：年龄只能介于0-150之间
 *
 */
public class AgeException extends Exception{

	private String message="年龄只能介于0-150之间";//异常信息
	
	public String getMessage() {
		return message;
	}
}
