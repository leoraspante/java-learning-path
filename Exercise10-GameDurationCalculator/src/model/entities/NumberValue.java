// Entity class representing a numerical value.

package model.entities;

public class NumberValue {
	
	// Fields.
	private Integer startTime;
	private Integer finishTime;
	
	// Constructor.
	public NumberValue(Integer startTime, Integer finishTime) {
		this.startTime = startTime;
		this.finishTime = finishTime;
	}

	// Getters and Setters.
	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	
	public Integer getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Integer finishTime) {
		this.finishTime = finishTime;
	}
}
