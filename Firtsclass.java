
public class Firtsclass {
	private String msg;
	public Firtsclass(String str)
	{
		msg = str;
	}
	public void setMgs(String s)
	{
		 msg=s;
	}
	public String getMgs()
	{
		 return msg;
	}
	public static void main(String args[]) {
		
		Firtsclass f = new Firtsclass ("Hello");
		String msg = f.getMgs();
		System.out.println(msg);
		msg = msg + "Java";
		f.setMgs(msg);
		System.out.println(f.getMgs());
	}

}
