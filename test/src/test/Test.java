package test;

public class Test implements Runnable {
	Thread th;
	labelSet ls = new labelSet();
	getTime gt = new getTime();

	Test() {
		ls.setting();
		ls.label();
		if (th == null) {
			th = new Thread(this);
			th.start();
		}
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
				
				if (ls.g.equals("us")) {
					usgetTime usgt = new usgetTime();
					ls.hms.setText(usgt.watch);
				}
				else if (ls.g.equals("ch")) {
					chgetTime chgt = new chgetTime();
					ls.hms.setText(chgt.watch);
				}
				else if (ls.g.equals("ko")){
					kogetTime kogt = new kogetTime();
					ls.hms.setText(kogt.watch);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new Test();
	}
}