package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android{
   
	 //private data member
		private int version;
		
		//getters and setters
		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		//parameterized constructor
		public SnowCone(String brand, String slotType, int version) {
			super(brand, slotType);
			this.version=version;
		}
	
	
	public SnowCone(String brand, String slotType) {
		super(brand, slotType);
		this.version=version;
	}

}
