package GameObject;

import java.util.ArrayList;

//��ҵķɻ�
public class PlayerPlane extends Plane{
	
	//���������ѡ��ͬ����ķɻ�������Ϸ
	public int kind;
	public ArrayList<Missile> shooted_missiles;
	public boolean alive;
	
	public PlayerPlane(){
		super();
		kind=-1;
		shooted_missiles=new ArrayList<Missile>();
		alive=true;
	}
	
	public PlayerPlane(Position pos,int kind){
		super(pos);
		this.kind=kind;
		shooted_missiles=new ArrayList<Missile>();
		alive=true;
	}

}
