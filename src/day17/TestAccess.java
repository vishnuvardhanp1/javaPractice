package day17;


	public  class TestAccess {
		private int privateNum=20;
		int defaultNum=30;
		protected int protectedNum;
		public int publicNum;
		void print() {
			System.out.println(this.privateNum);
		}
	}
	
	class TestAccess2 extends TestAccess {
		void print() {
			super.print();
			System.out.println(this.defaultNum);
		}
	}

