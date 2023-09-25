package java8streams03;

public interface FairGround {
	public String saluda();

	public default FairGround dismantle() {
		return this;
	}
}
