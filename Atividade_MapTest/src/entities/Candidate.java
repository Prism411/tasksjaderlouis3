package entities;

import java.util.Objects;

public class Candidate {

	    private String name;
	    protected int voteCount;

	    public Candidate(String name, int voteCount) {
	        this.name = name;
	        this.voteCount = voteCount;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getVoteCount() {
	        return voteCount;
	    }

	public int addVote(int voteCount) {
		return this.voteCount += voteCount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", voteCount=" + voteCount + "]";
	}
	

	
	
	
	
	
	
}
