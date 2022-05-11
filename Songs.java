
public class Songs extends Music {
	public void songtype(){
		System.out.println(" its a  pop song");
	}
	public static void main(String[] args) {
		Music m=new Songs();
		m.songtype();
		m.songname();

	}
}
