package com.oops.containment;

public class Cities {
		// TODO Auto-generated method stub
		private int ctid;
		private String ctname;
		private States states;
		
		public Cities() {
			
		}
		public Cities(int ctid,String ctname,States states) {
			this.ctid=ctid;
			this.ctname=ctname;
			this.states=states;
		}
		public void setCtid(int ctid) {
			this.ctid=ctid;
		}
		public int getCtid() {
			return ctid;
		}
	
		public void setCtname(String name) {
			this.ctname=name;
		}
		public String getCtname() {
			return ctname;
		}
		public void setStates(States states) {
			this.states=states;
		}
		public States getStates() {
			return states;
		}
		public String toString() {
			return "city_id: "+ctid+"\ncity_name: "+ctname+"\n"+states;
		}
}
