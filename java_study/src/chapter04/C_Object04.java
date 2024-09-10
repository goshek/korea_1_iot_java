package chapter04;

class Phone {
    String type;
    String date;
    
    public Phone(String string, String string2) {
		this.type= string;
		this.date= string2;
	}

	void printoption(){
    	System.out.println("type: "+ type +"date:" + date);
    }
}
public class C_Object04 {
	public static void main(String[] args) {
		Phone myPhone= new Phone("iphone", "20240905");
		myPhone.printoption();
	}
}
