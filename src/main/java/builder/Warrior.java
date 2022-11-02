package builder;

public class Warrior {
	private int attackRate;
	private int defenseRate;
	private int lifePoints;
	private int maxLifePoints;
	private String name;
	
	private Warrior(Builder builder) {
		this.attackRate = builder.attackRate;
		this.defenseRate = builder.defenseRate;
		this.lifePoints = builder.lifePoints;
		this.maxLifePoints = builder.maxLifePoints;
		this.name = builder.name;
	}
	
	public static class Builder{
		
		private int attackRate;
		private int defenseRate;
		private int lifePoints;
		private int maxLifePoints;
		private String name;
		
		public Builder attackRate(final int attackRate) {
			this.attackRate = attackRate;
			return this;
		}
		
		public Builder defenseRate(final int defenseRate) {
			this.defenseRate = defenseRate;
			return this;
		}
		
		public Builder lifePoints(final int lifePoints) {
			this.lifePoints = lifePoints;
			return this;
		}
		
		public Builder maxLifePoints(final int maxLifePoints) {
			this.maxLifePoints = maxLifePoints;
			return this;
		}
		
		public Builder name(final String name) {
			this.name = name;
			return this;
		}
		
		public Warrior build() {
			return new Warrior(this);
		}
		
	}

	public int getAttackRate() {
		return attackRate;
	}

	public void setAttackRate(int attackRate) {
		this.attackRate = attackRate;
	}

	public int getDefenseRate() {
		return defenseRate;
	}

	public void setDefenseRate(int defenseRate) {
		this.defenseRate = defenseRate;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public int getMaxLifePoints() {
		return maxLifePoints;
	}

	public void setMaxLifePoints(int maxLifePoints) {
		this.maxLifePoints = maxLifePoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
