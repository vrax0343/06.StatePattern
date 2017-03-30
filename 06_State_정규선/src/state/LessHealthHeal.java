package state;

public class LessHealthHeal implements State{
	NewUnit nu;
	
	public LessHealthHeal(NewUnit nu) {
		super();
		this.nu = nu;
	}

	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
//		System.out.println(nu.getType() + "자가치료 시작");
		if(nu.getMana() <= 0){
			System.out.println(nu.getType() + "의 마나가 부족합니다");
			nu.setState(nu.getCantSelfHeal());
			nu.check = 1;
		} else{
			nu.setHealth(nu.getHealth()+1,1);
			nu.setMana(nu.getMana()-1);
			System.out.println("남은 마나량은: '"+nu.getMana()+"'");
		}
		System.out.println();
	}

}
