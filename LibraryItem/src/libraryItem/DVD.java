 package libraryItem;

 class DVD extends LibraryItem{
		
		private double duration;
		
		public DVD(String title, int itemID, double duration) {
			super(title, itemID);
			this.duration = duration;
		}
		
		public double getDuration() {
			return duration;
		}

		public void setDuration(double duration) {
			this.duration = duration;
		}

		@Override
		public void displayInfo() {
			System.out.println("This is DVD");
			System.out.println(this.toString());
		}

		@Override
		public String toString() {
			return "DVD [" + super.getTitle()  + ","+ super.getItemID() + "," + duration  + "] \n";
		}
		
		
		
	}

